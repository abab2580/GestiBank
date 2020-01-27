package metier;

public class Administrateur {
	private int id;
	private String matricule;
	
	public Administrateur(int id, String matricule) {
		super();
		this.id = id;
		this.matricule = matricule;
	}
	public Administrateur() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	

}
