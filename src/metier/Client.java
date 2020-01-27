package metier;

public class Client extends Utilisateurs {
	
	private String telephone;
	private int nbEfants;
	private String document;
	private String statut;
	
	public Client() {
		super();
	}

	public Client(String nom, String motDepasse, String email,  String telephone, int nbEfants, String document,
			String statut) {
		
		super(nom,motDepasse,email);
		this.telephone = telephone;
		this.nbEfants = nbEfants;
		this.document = document;
		this.statut = statut;
	}

	public Client(String nom, String motDepasse, String email) {
		super(nom, motDepasse, email);
	}
	
	
	
   

	public Client(int id, String nom, String motDepasse, String email) {
		super(id, nom, motDepasse, email);
	}

	public Client(int id, String nom, String motDepasse, String email, String telephone, int nbEfants, String document,
			String statut) {
		super(id, nom, motDepasse, email);
		this.telephone = telephone;
		this.nbEfants = nbEfants;
		this.document = document;
		this.statut = statut;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getNbEfants() {
		return nbEfants;
	}

	public void setNbEfants(int nbEfants) {
		this.nbEfants = nbEfants;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	
	
	
	

}
