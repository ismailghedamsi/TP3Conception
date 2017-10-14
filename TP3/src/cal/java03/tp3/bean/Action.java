package cal.java03.tp3.bean;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

public class Action {
	
	private String symbole;
	private String description;
	private BigDecimal prix;
	private List collectionHistorique ;
	private List collectionDividente;
	private float valeurChange;
	private float volume;
	
	
	// Constructeur d'une Action
	public Action(String symbole, String description, BigDecimal prix, List collectionHistorique,
			List collectionDividente, float valeurChange, float volume) {
		super();
		this.symbole = symbole;
		this.description = description;
		this.prix = prix;
		this.collectionHistorique = collectionHistorique;
		this.collectionDividente = collectionDividente;
		this.valeurChange = valeurChange;
		this.volume = volume;
	}
	
	
	@Override
	public String toString() {
		return "Action [symbole=" + symbole + ", description=" + description + ", prix=" + prix
				+ ", collectionHistorique=" + collectionHistorique + ", collectionDividente=" + collectionDividente
				+ ", valeurChange=" + valeurChange + ", volume=" + volume + "]";
	}






	public String getSymbole() {
		return symbole;
	}






	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}






	public String getDescription() {
		return description;
	}






	public void setDescription(String description) {
		this.description = description;
	}






	public BigDecimal getPrix() {
		return prix;
	}






	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}






	public Collection getCollectionHistorique() {
		return collectionHistorique;
	}






	public void setCollectionHistorique(List collectionHistorique) {
		this.collectionHistorique = collectionHistorique;
	}






	public List getCollectionDividente() {
		return collectionDividente;
	}






	public void setCollectionDividente(List collectionDividente) {
		this.collectionDividente = collectionDividente;
	}






	public float getValeurChange() {
		return valeurChange;
	}






	public void setValeurChange(float valeurChange) {
		this.valeurChange = valeurChange;
	}






	public float getVolume() {
		return volume;
	}






	public void setVolume(float volume) {
		this.volume = volume;
	}






	public float calculDividente() {
		return 0;
	}
}
