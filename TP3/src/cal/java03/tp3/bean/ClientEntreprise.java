package cal.java03.tp3.bean;





public class ClientEntreprise extends Client {
	private static int compteur;
	private  int idClientEntreprise;
	private String nomEntreprise;
	private String cote;
	private int nombreEmploye;
	public ClientEntreprise(String etatCompte, String email, String nomEntreprise,
			String cote, int nombreEmploye) {
		super(email);
		this.nomEntreprise = nomEntreprise;
		this.cote = cote;
		this.nombreEmploye = nombreEmploye;
	}
	
}
