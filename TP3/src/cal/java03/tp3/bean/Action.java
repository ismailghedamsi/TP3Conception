package cal.java03.tp3.bean;

import java.math.BigDecimal;
import java.util.List;

import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes2.HistoricalDividend;

/**
 * Classee representant les actions d'une bourse 
 * @author small44
 *
 */
public class Action {
	
	private String symbole;
	private String description;
	private BigDecimal prix;
	private List<HistoricalQuote> collectionHistorique ;
	private List<HistoricalDividend> collectionDividente;
	private float valeurChange;
	private float volume;
	
	/**
	 * Constructeur d'une Action a partir des donnees de Yahoo finance
	 * @param symbole
	 * @param description
	 * @param prix
	 * @param collectionHistorique
	 * @param collectionDividente
	 * @param valeurChange
	 * @param volume
	 */
	public Action(String symbole, String description, BigDecimal prix, List<HistoricalQuote> collectionHistorique,
			List<HistoricalDividend> collectionDividente, float valeurChange, float volume) {
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
	/**
	 * 
	 * @return le symbole de l'action
	 */
	public String getSymbole() {
		return symbole;
	}
	/**
	 * Modifier le symbole de l'action
	 * @param symbole
	 */
	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}

	/**
	 * 
	 * @return la description de l'action
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * Modifier la description de l'action
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}






	public BigDecimal getPrix() {
		return prix;
	}






	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}







	public List<HistoricalQuote> getCollectionHistorique() {
		return collectionHistorique;
	}

	public void setCollectionHistorique(List<HistoricalQuote> collectionHistorique) {
		this.collectionHistorique = collectionHistorique;
	}

	public List<HistoricalDividend> getCollectionDividente() {
		return collectionDividente;
	}

	public void setCollectionDividente(List<HistoricalDividend> collectionDividente) {
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
