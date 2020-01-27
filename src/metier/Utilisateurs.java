package metier;

public class Utilisateurs {
	
	private int id;
	private String nom;
	private String motDepasse;
	private String email;
	
	
	
	public Utilisateurs() {
		
	}
	
	
	public Utilisateurs(String nom, String motDepasse, String email) {
		
		this.nom = nom;
		this.motDepasse = motDepasse;
		this.email = email;
	}
	
	
	

	public Utilisateurs(int id, String nom, String motDepasse, String email) {
		
		this.setId(id);
		this.nom = nom;
		this.motDepasse = motDepasse;
		this.email = email;
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


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	

}
