package cal.java03.tp3.bean;

import java.util.*;

/**
 * Classe mere des clients particuliers et entreprise
 * @author small44
 *
 */
public class Client  {
	private static int compteur;
	private int idClient;
	private Collection<Action> listeAction;
	private String etatCompte;
	private String email;
	private Portefeuille compte;
	
	/**
	 * Constructeur client
	 * @param email
	 */
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
	
	
	/**
	 * 
	 * @return la liste des actions d'un client
	 */
	public Collection<Action> getListeAction() {
		return listeAction;
	}


	/**
	 * Modificateur de la liste des actions
	 * @param listeAction
	 */
	public void setListeAction(Collection<Action> listeAction) {
		this.listeAction = listeAction;
	}


	/**
	 * 
	 * @return l'etat du compte (active,inactive,ferme)
	 */
	public String getEtatCompte() {
		return etatCompte;
	}


	/**
	 * Modificateur de l'ectat du compte
	 * @param etatCompte
	 */
	public void setEtatCompte(String etatCompte) {
		this.etatCompte = etatCompte;
	}


	/**
	 * 
	 * @return l'email du client
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * Modificateur de l'email de
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * 
	 * @return le compte (portefeuille du client)
	 */
	public Portefeuille getCompte() {
		return compte;
	}


	/**
	 * Modificateur du portefeuille
	 * @param compte
	 */
	public void setCompte(Portefeuille compte) {
		this.compte = compte;
	}


	
}
