package cal.java03.tp3.bean;

import java.io.IOException;
import java.util.*;

import cal.java03.tp3.service.ServiceDao;
import cal.java03.tp3.util.IConstant;

public class Bourse {
	private  static List<String> ListSymboleActionNational;
	private   static List<String> ListSymboleActionInterational;
	private  List<Client> listeClient;
	private static Map<String,Client> mapClientActive;
	private static Map<String,Client> mapClientInative;
	private static float caisse;
	
	//instanciation statique
	static {
		mapClientActive = new HashMap<>();
		mapClientInative = new HashMap<>();
		try {
			ListSymboleActionNational = ServiceDao.fillListActionFromFile(IConstant.ACTIONNATIONALPATH);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		try {
			ListSymboleActionInterational = ServiceDao.fillListActionFromFile(IConstant.ACTIONINTERNATIONALPATH);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Map<String, Client> getMapClientActive() {
		return mapClientActive;
	}
	public static void setMapClientActive(Map<String, Client> mapClientActive) {
		Bourse.mapClientActive = mapClientActive;
	}
	public static Map<String, Client> getMapClientInative() {
		return mapClientInative;
	}
	public static void setMapClientInative(Map<String, Client> mapClientInative) {
		Bourse.mapClientInative = mapClientInative;
	}
	public Bourse() throws Exception {
		super();
		ListSymboleActionNational = ServiceDao.fillListActionFromFile("./Symboles_Actions.Canada.txt");;
		ListSymboleActionInterational = ServiceDao.fillListActionFromFile("./Symboles_Actions_Internationnales");
		this.listeClient = new ArrayList<Client>();
		caisse = 0;
	}

	
	public static List<String> getListSymboleActionNational() {
		return ListSymboleActionNational;
	}
	public static void setListSymboleActionNational(List<String> listSymboleActionNational) {
		ListSymboleActionNational = listSymboleActionNational;
	}
	public static List<String> getListSymboleActionInterational() {
		return ListSymboleActionInterational;
	}
	public static void setListSymboleActionInterational(List<String> listSymboleActionInterational) {
		ListSymboleActionInterational = listSymboleActionInterational;
	}
	public List<Client> getListeClient() {
		return listeClient;
	}
	public void setListeClient(List<Client> listeClient) {
		this.listeClient = listeClient;
	}
	public static float getCaisse() {
		return caisse;
	}
	public static void setCaisse(float caisse) {
		Bourse.caisse = caisse;
	}

	
	
	
}
