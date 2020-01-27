package metier;

public class Utilisateurs {
	private String nom;
	private String motDepasse;
	private String email;
	public Utilisateurs(String nom, String motDepasse, String email) {
		super();
		this.nom = nom;
		this.motDepasse = motDepasse;
		this.email = email;
	}
	public Utilisateurs() {
		super();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMotDepasse() {
		return motDepasse;
	}
	public void setMotDepasse(String motDepasse) {
		this.motDepasse = motDepasse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
