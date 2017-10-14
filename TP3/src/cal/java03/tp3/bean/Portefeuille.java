package cal.java03.tp3.bean;

import java.util.ArrayList;
import java.util.List;

public class Portefeuille {
	private static int compteur;
	private List<Action> listeAction;
	private int idPortefeuille;
	private int idClient;
	private String typePortefeuille;
	private float argentInvesti;
	public Portefeuille(int idClient, String typePortefeuille,float argentInvesti ) {
		super();
		this.idClient = idClient;
		this.typePortefeuille = typePortefeuille;
		this.listeAction = new ArrayList<Action>();
		this.argentInvesti = argentInvesti;
	}
	public static int getCompteur() {
		return compteur;
	}
	public static void setCompteur(int compteur) {
		Portefeuille.compteur = compteur;
	}
	public List<Action> getListeAction() {
		return listeAction;
	}
	public void setListeAction(List<Action> listeAction) {
		this.listeAction = listeAction;
	}
	public String getTypePortefeuille() {
		return typePortefeuille;
	}
	public void setTypePortefeuille(String typePortefeuille) {
		this.typePortefeuille = typePortefeuille;
	}
	public float getArgentInvesti() {
		return argentInvesti;
	}
	public void setArgentInvesti(float argentInvesti) {
		this.argentInvesti = argentInvesti;
	}
	public int getIdPortefeuille() {
		return idPortefeuille;
	}
	public int getIdClient() {
		return idClient;
	}
	
	
	
}
