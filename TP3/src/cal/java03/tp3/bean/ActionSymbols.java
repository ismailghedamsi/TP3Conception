package cal.java03.tp3.bean;


import java.util.List;

import cal.java03.tp3.service.ServiceDao;

public class ActionSymbols {
	private static List<String> listeSymboles;

	public ActionSymbols() {
		super();
		ActionSymbols.listeSymboles = ServiceDao.fillListActionFromFile("./Symboles_Actions.Canada.txt");
	}

	public List<String> getListeSymboles() {
		return listeSymboles;
	}
	
	
	
}
