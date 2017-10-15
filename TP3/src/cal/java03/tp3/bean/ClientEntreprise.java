package cal.java03.tp3.bean;

import cal.java03.tp3.service.ServiceDao;

/**
 * Classe representant un actionnaire de type Entreprise
 * @author small44
 *
 */
public class ClientEntreprise extends Client {
	private static int compteur;
	private  int idClientEntreprise;
	private String nomEntreprise;
	private String cote;
	private int nombreEmploye;
	/**
	 * Constructeur client entreprise
	 * @param etatCompte
	 * @param email
	 * @param nomEntreprise
	 * @param cote
	 * @param nombreEmploye
	 */
	public ClientEntreprise(String etatCompte, String email, String nomEntreprise,
			String cote, int nombreEmploye) {
		super(email);
		this.nomEntreprise = nomEntreprise;
		this.cote = cote;
		this.nombreEmploye = nombreEmploye;
		this.idClientEntreprise =compteur;
		compteur++;
	}
	
	/**
	 * 
	 * @return le nom de l'entrprise
	 */
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	
	/**
	 * Modificateur du nom de l'entreprise
	 * @param nomEntreprise
	 */
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	
	/**
	 * 
	 * @return Le cote de l'entreprise
	 */
	public String getCote() {
		return cote;
	}
	/**
	 * Modificateur de la cote de l'entrprise
	 * @param cote
	 */
	public void setCote(String cote) {
		this.cote = cote;
	}
	
	/**
	 * 
	 * @return le nombre d'employe impliqués dans le portefeuille.
	 */
	public int getNombreEmploye() {
		return nombreEmploye;
	}
	/**
	 * Modificateur du nombre d'employe impliqués dans le portefeuille.
	 * @param nombreEmploye
	 */
	public void setNombreEmploye(int nombreEmploye) {
		this.nombreEmploye = nombreEmploye;
	}
	
	/**
	 * 
	 * @return l'id du client
	 */
	public int getIdClientEntreprise() {
		return idClientEntreprise;
	}
	
	
}
