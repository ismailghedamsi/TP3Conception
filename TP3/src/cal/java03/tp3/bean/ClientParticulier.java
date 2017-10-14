package cal.java03.tp3.bean;

import java.io.IOException;
import java.math.BigDecimal;

import cal.java03.tp3.service.ServiceDao;
import cal.java03.tp3.util.IOperation;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class ClientParticulier extends Client /*implements IOperation*/{
	private static int compteur=1;
	private  int idClientParticulier;
	private String nom;
	private String prenom;

	public ClientParticulier(String etatCompte,String email,String nom, String prenom) {
		super(email);
		this.idClientParticulier = compteur;
		compteur++;
		this.nom = nom;
		this.prenom = prenom;
	
	}
	
	

	public int getIdClientParticulier() {
		return idClientParticulier;
	}



	public void setIdClientParticulier(int idClientParticulier) {
		this.idClientParticulier = idClientParticulier;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public Portefeuille getCompte() {
		return super.getCompte();
	}



	public void setCompte(Portefeuille compte) {
		super.setCompte(compte);
	}



/*	@Override
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
		
	}*/

	//@Override
/*	public void acheterAction(String symboleAction, BigDecimal nbActions) {
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
		if(valeurTransactionTotal > 10_000) {
			ServiceDao.saveXml("./incidents.xml", this);
		}
		
	}*/
	
	
	
	

}
