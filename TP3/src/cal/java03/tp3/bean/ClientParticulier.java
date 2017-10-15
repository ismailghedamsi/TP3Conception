package cal.java03.tp3.bean;


/**
 * Actionnaire particulier
 * @author small44
 *
 */
public class ClientParticulier extends Client{
	private static int compteur=1;
	private  int idClientParticulier;
	private String nom;
	private String prenom;

	/**
	 * Constructeur d'un client particulier avec un compte par defaut
	 * @param etatCompte
	 * @param email
	 * @param nom
	 * @param prenom
	 */
	public ClientParticulier(String etatCompte,String email,String nom, String prenom) {
		super(email);
		this.idClientParticulier = compteur;
		compteur++;
		this.nom = nom;
		this.prenom = prenom;
	
	}
	

	/**
	 * 
	 * @return l'id du client
	 */
	public int getIdClientParticulier() {
		return idClientParticulier;
	}

  /**
   * 
   * @return le nom du client
   */
	public String getNom() {
		return nom;
	}


	/**
	 * Modificateur du nom du client
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * 
	 * @return le prenom du client
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * Modificateur du prenom du client
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * @return le compte du client
	 */
	public Portefeuille getCompte() {
		return super.getCompte();
	}


	/**
	 * Modificateur du compte
	 * @param compte
	 */
	public void setCompte(Portefeuille compte) {
		super.setCompte(compte);
	}


}
