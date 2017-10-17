package cal.java03.tp3.service;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import com.thoughtworks.xstream.*;
import com.thoughtworks.xstream.io.xml.DomDriver;

import cal.java03.tp3.bean.*;


/**
 * 
 * @author small44
 * Classe de service qui implemente le C.R.U.D
 */
public class ServiceDao {
	
	/**
	 * Methode pour importer la liste des symboles des action
	 * @param pathName
	 * @return
	 * @throws IOException
	 */
	public static List<String> fillListActionFromFile(String pathName) throws IOException {
		
		return FileUtils.readLines(new File("./Symboles_Actions.Canada.txt"),"UTF-8");
	}
	
	/**
	 * Implementation du C du C.R.U.D
	 * @param bourse
	 * @param client
	 */
	public static void addClientToMap(Map<String,Client> mapClient,Client client) {
		mapClient.put(client.getEmail(), client);
	}
	
	/**
	 * Implementation du D du C.R.U.D
	 * @param bourse
	 * @param client
	 */
	public static void deleteClientFromMap(Map<String,Client> mapClient,Client client) {
		mapClient.remove(client.getEmail());
	}
	
	/**
	 * Implementation du R du C.R.U.D
	 * @param bourse
	 * @param client
	 */
	public static void MapContainsClient(Map<String,Client> mapClient,Client client) {
		mapClient.remove(client.getEmail());
	}
	
	
	public static void addActionToActionList(List<Action> liste,Action action) {
		liste.add(action);
	}
	
	public static void removeActionFromActionList(List<Action> liste,Action action) {
		liste.add(action);
	}
	
	
	public static boolean actionListContainsAction(List<Action> liste,Action action) {
		return liste.contains(action);
	}
	
	public static void addClientToBourse(List<Client> listeClientBourse,Client client) {
		listeClientBourse.add(client);
	}
	

	
	
	/**
	 * Generer un fichier xml avec la librarie Java io 
	 * @param fileName
	 * @param client
	 * @return
	 */
	public static  boolean saveIncident(String fileName, Client client) {
		try {

			XStream stream = new XStream(new DomDriver());
			
			// Seulement sauvegarder les champs id,liste transaction et le total es transaction
			if(client instanceof ClientParticulier) {
				stream.alias("Client", Client.class);
				stream.alias("ClientParticulier", ClientParticulier.class);
				stream.alias("ClientEntreprise", ClientEntreprise.class);
				stream.omitField(ClientParticulier.class, "nom");
				stream.omitField(ClientParticulier.class, "prenom");
				stream.omitField(ClientParticulier.class, "compte");
				stream.omitField(ClientParticulier.class, "email");
				stream.omitField(ClientParticulier.class, "idClientParticulier");
				
			}else if(client instanceof ClientEntreprise){
				stream.omitField(ClientEntreprise.class, "cote");
				stream.omitField(ClientEntreprise.class, "nombreEmploye");
			}
			stream.omitField(Client.class, "compte");
			stream.omitField(Client.class, "etatCompte");
			stream.omitField(Client.class, "listeAction");
			stream.omitField(Client.class, "email");
			stream.toXML(client, new FileOutputStream(fileName));

			return new File(fileName).exists();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	/**
	 * Generer le fichier xml des traiments d'un client
	 * @param client
	 * @return si le fichier a ete cree
	 * @throws Exception
	 */
	public static boolean saveTraitement(Client client) throws Exception {
		String pathName;
		XStream stream = new XStream(new DomDriver());
		if(client instanceof ClientParticulier) {
			pathName = "./"+((ClientParticulier) client).getIdClientParticulier()
					+"-Historiques.xml";
			stream.toXML(client,new FileOutputStream(new File(pathName)));
		}else {
			pathName = "./"+((ClientEntreprise) client).getIdClientEntreprise()
					+"-Historiques.xml";
		}
		return new File(pathName).exists();
		
	}
	/**
	 * Enregister la liste des actions implique
	 * @param pathName
	 * @param totalTransaction
	 * @return
	 * @throws Exception
	 */
	public static boolean saveListeActionImpliquee(String pathName,Double totalTransaction) throws Exception {
		XStream stream = new XStream(new DomDriver());
		stream.toXML(totalTransaction, new FileOutputStream(new File(pathName),true));
		return new File(pathName).exists();
	}

	
}
