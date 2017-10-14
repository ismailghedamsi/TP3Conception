package cal.java03.tp3.bean;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

import cal.java03.tp3.service.ServiceDao;
import cal.java03.tp3.util.IOperation;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class Client implements IOperation {
	private static int compteur;
	private int idClient;
	private Collection<Action> listeAction;
	private String etatCompte;
	private String email;
	private Portefeuille compte;
	public Client(String email) {
		super();
		this.listeAction = new ArrayList<Action>();
		// Creation d'un compte pour chaque nouveau client
		this.compte = new Portefeuille(this.idClient,"national",500000000);
		this.etatCompte = "active";
		this.email = email;
		this.idClient = compteur;
		compteur++;
	}
	
	
	
	public Collection<Action> getListeAction() {
		return listeAction;
	}



	public void setListeAction(Collection<Action> listeAction) {
		this.listeAction = listeAction;
	}



	public String getEtatCompte() {
		return etatCompte;
	}



	public void setEtatCompte(String etatCompte) {
		this.etatCompte = etatCompte;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Portefeuille getCompte() {
		return compte;
	}



	public void setCompte(Portefeuille compte) {
		this.compte = compte;
	}


	// Action et Client
	public void acheterAction(String symboleAction, BigDecimal nbActions) {
		Stock stock = null;
		BigDecimal prixAction = null;
		Action action = null;
		float valeurTransactionTotal = 0;
		//Verifier que le symbole de l'action estValide
		ActionSymbols as = new ActionSymbols(); 
		if(as.getListeSymboles().contains(symboleAction)){
			try {
				stock = YahooFinance.get(symboleAction);
				System.out.println(stock.getName());
			} catch (IOException e) {
				e.printStackTrace();
			}
			//Verifier si le compte est active et le client a l'argent necesaire pour
			//acheter un ensemble d'action 
		     valeurTransactionTotal = stock.getQuote().getPrice().multiply(nbActions).intValue();
			if(this.etatCompte.equals("active") && 
					valeurTransactionTotal<this.compte.getArgentInvesti()) {
				prixAction = stock.getQuote().getPrice();
				try {
					action = new Action(symboleAction, stock.getName(), prixAction, stock.getHistory(), stock.getDividendHistory(), stock.getQuote().getChange().floatValue(), stock.getQuote().getVolume());
					System.out.println("action" + action);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ServiceDao.addActionToActionCollection(this.getCompte().getListeAction(), action);
	
			}
		}
		if(valeurTransactionTotal > 10_000 && this instanceof ClientParticulier) {
			ServiceDao.saveXml("./incidents.xml", this);
		}else if(valeurTransactionTotal > 100_000 && this instanceof ClientEntreprise) {
			ServiceDao.saveXml("./incidents.xml", this);
		}
		
	}



	@Override
	public void vendreAction() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void fermerPortefeuille() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void ouvrirPortefeuille() {
		// TODO Auto-generated method stub
		
	}
	
	
}
