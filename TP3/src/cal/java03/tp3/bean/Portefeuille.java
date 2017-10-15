package cal.java03.tp3.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe representant un compte client pour effectuer des transations
 * @author small44
 *
 */
public class Portefeuille {
	private static int compteur;
	private List<Action> listeAction;
	private int idPortefeuille;
	private int idClient;
	private String typePortefeuille;
	private float argentInvesti;
	
	/**
	 * Contructeur d'un portefeuille
	 * @param idClient
	 * @param typePortefeuille
	 * @param argentInvesti
	 */
	public Portefeuille(int idClient, String typePortefeuille,float argentInvesti ) {
		super();
		this.idClient = idClient;
		this.typePortefeuille = typePortefeuille;
		this.listeAction = new ArrayList<Action>();
		this.argentInvesti = argentInvesti;
	}

	/**
	 * 
	 * @return la liste des actions dans un portefeuille
	 */
	public List<Action> getListeAction() {
		return listeAction;
	}
	
	/**
	 * Modificateur de la liste d'action
	 * @param listeAction
	 */
	public void setListeAction(List<Action> listeAction) {
		this.listeAction = listeAction;
	}
	
	/**
	 * 
	 * @return le type du portefeuille : national ou international
	 */
	public String getTypePortefeuille() {
		return typePortefeuille;
	}
	
	/**
	 * Modificateur du type de portefeuille
	 * @param typePortefeuille
	 */
	public void setTypePortefeuille(String typePortefeuille) {
		this.typePortefeuille = typePortefeuille;
	}
	
	/**
	 * 
	 * @return l'argent investi
	 */
	public float getArgentInvesti() {
		return argentInvesti;
	}
	
	/**
	 * Modificateur de l'argent investi
	 * @param argentInvesti
	 */
	public void setArgentInvesti(float argentInvesti) {
		this.argentInvesti = argentInvesti;
	}
	
	/**
	 * 
	 * @return l'id du portefeuille
	 */
	public int getIdPortefeuille() {
		return idPortefeuille;
	}
	
	/**
	 * l'id du client
	 * @return
	 */
	public int getIdClient() {
		return idClient;
	}
	
}
