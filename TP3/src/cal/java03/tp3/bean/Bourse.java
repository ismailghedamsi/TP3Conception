package cal.java03.tp3.bean;

import java.util.*;

import cal.java03.tp3.service.ServiceDao;

public class Bourse {
	private  List<String> ListSymboleActionNational;
	private  List<String> ListSymboleActionInterational;
	private List<Client> listeClient;
	private int caisse;
	public Bourse(List<String> listSymboleActionNational, List<String> listSymboleActionInterational,
			List<Client> listeClient, int caisse) throws Exception {
		super();
		ListSymboleActionNational = ServiceDao.fillListActionFromFile("./Symboles_Actions.Canada.txt");;
		ListSymboleActionInterational = ServiceDao.fillListActionFromFile("./Symboles_Actions_Internationnales");
		this.listeClient = new ArrayList<Client>();
		this.caisse = 0;
	}
	public List<String> getListSymboleActionNational() {
		return ListSymboleActionNational;
	}
	public void setListSymboleActionNational(List<String> listSymboleActionNational) {
		ListSymboleActionNational = listSymboleActionNational;
	}
	public List<String> getListSymboleActionInterational() {
		return ListSymboleActionInterational;
	}
	public void setListSymboleActionInterational(List<String> listSymboleActionInterational) {
		ListSymboleActionInterational = listSymboleActionInterational;
	}
	public List<Client> getListeClient() {
		return listeClient;
	}
	public void setListeClient(List<Client> listeClient) {
		this.listeClient = listeClient;
	}
	public int getCaisse() {
		return caisse;
	}
	public void setCaisse(int caisse) {
		this.caisse = caisse;
	}
	
	
	
}
