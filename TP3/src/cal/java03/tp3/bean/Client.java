package cal.java03.tp3.bean;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

import cal.java03.tp3.service.ServiceDao;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class Client  {
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


	
}
