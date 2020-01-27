package metier;

public class Conseiller extends Utilisateurs{
	private int id;
	private String telephone;
	private String matricule;
	public Conseiller(String nom, String motDepasse, String email, int id, String telephone, String matricule) {
		super(nom, motDepasse, email);
		this.id = id;
		this.telephone = telephone;
		this.matricule = matricule;
	}
	public Conseiller(String nom, String motDepasse, String email) {
		super(nom, motDepasse, email);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
