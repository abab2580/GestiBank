package metier;

public class Demande {
	private int id;
	private String typeDemande;
	private String dateDemande;
	private int nbEnfants;
	private String telephone;
	private String identifiant;
	private String document;
	private String statut;
	
	public Demande(int id, String typeDemande, String dateDemande, int nbEnfants, String telephone, String identifiant,
			String document, String statut) {
		super();
		this.id = id;
		this.typeDemande = typeDemande;
		this.dateDemande = dateDemande;
		this.nbEnfants = nbEnfants;
		this.telephone = telephone;
		this.identifiant = identifiant;
		this.document = document;
		this.statut = statut;
	}
	
	public Demande() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeDemande() {
		return typeDemande;
	}
	public void setTypeDemande(String typeDemande) {
		this.typeDemande = typeDemande;
	}
	public String getDateDemande() {
		return dateDemande;
	}
	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}
	public int getNbEnfants() {
		return nbEnfants;
	}
	public void setNbEnfants(int nbEnfants) {
		this.nbEnfants = nbEnfants;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
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
