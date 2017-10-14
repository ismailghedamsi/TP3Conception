package cal.java03.tp3.service;

import java.io.*;
import java.util.*;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import cal.java03.tp3.bean.Action;
import cal.java03.tp3.bean.Client;
import cal.java03.tp3.bean.ClientParticulier;
import cal.java03.tp3.bean.Portefeuille;

public class ServiceDao {
	
	public static List<String> fillListActionFromFile(String pathName) {
		String symbol;
		List<String> actionSymboles = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(pathName)));
			while((symbol = br.readLine()) != null) {
				actionSymboles.add(symbol);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return actionSymboles;
	}
	
	public static void addActionToActionCollection(List<Action> collection,Action action) {
		collection.add(action);
	}
	
	public static boolean saveXml(String fileName, Client client) {

		try {

			XStream stream = new XStream(new DomDriver());
			stream.alias("Client", Client.class);
			// Seulement sauvegarder les champs id,liste transaction et le total es transaction
			stream.omitField(Client.class, "nom");
			stream.omitField(Client.class, "prenom");
			stream.omitField(Client.class, "compte");
			stream.omitField(Client.class, "email");
			stream.toXML(client, new FileOutputStream(fileName,true));

			return new File(fileName).exists();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	
}
