package metier;

public class Compte {
	private int id;
	private String typeCompte;
	private String dateCreation;
	private double soldes;
	private double tauxRenumerations;
	public Compte(int id, String typeCompte, String dateCreation, double soldes, double tauxRenumerations) {
		super();
		this.id = id;
		this.typeCompte = typeCompte;
		this.dateCreation = dateCreation;
		this.soldes = soldes;
		this.tauxRenumerations = tauxRenumerations;
	}
	public Compte() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSoldes() {
		return soldes;
	}
	public void setSoldes(double soldes) {
		this.soldes = soldes;
	}
	public double getTauxRenumerations() {
		return tauxRenumerations;
	}
	public void setTauxRenumerations(double tauxRenumerations) {
		this.tauxRenumerations = tauxRenumerations;
	}
	
	
	

}
