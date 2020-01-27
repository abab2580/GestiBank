package metier;

public class Conseiller extends Utilisateurs{
	
	private String telephone;
	private String matricule;
	
	
	public Conseiller() {
	   // constructeur conseiller
	}
	
	public Conseiller(String nom, String motDepasse, String email) {
		
		super(nom, motDepasse, email);
	}
	
	
	public Conseiller(String nom, String motDepasse, String email,  String telephone, String matricule) {
		
		super(nom, motDepasse, email);
		this.telephone = telephone;
		this.matricule = matricule;
		
	}
    

	public Conseiller(int id, String nom, String motDepasse, String email, String telephone, String matricule) {
		super(id, nom, motDepasse, email);
		this.telephone = telephone;
		this.matricule = matricule;
	}

	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	

}
