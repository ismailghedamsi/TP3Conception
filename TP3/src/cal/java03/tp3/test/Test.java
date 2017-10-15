package cal.java03.tp3.test;

import java.io.IOException;
import java.math.BigDecimal;

import cal.java03.tp3.bean.Client;
import cal.java03.tp3.bean.ClientEntreprise;
import cal.java03.tp3.bean.ClientParticulier;
import cal.java03.tp3.service.ServiceDao;
import cal.java03.tp3.service.ServiceOperations;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class Test {
	public static void main(String[] args) throws Exception {
		ClientParticulier c = new ClientParticulier("active", "ismailghedamsi@gmail.com", "ismail", "Ghedamsi");
		ClientEntreprise ce = new ClientEntreprise("active", "sony@gmail.com", "Sony", "52", 20);
		try {
			Stock stock = YahooFinance.get("ASR");
			System.out.println(stock.getQuote().getPrice());
			ServiceOperations.acheterAction("TD",c, new BigDecimal(300));
			ServiceOperations.acheterAction("ASR", ce,new BigDecimal(200));
			System.out.println(c.getCompte().getListeAction().size());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
