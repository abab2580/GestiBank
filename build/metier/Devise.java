package metier;

public class Devise {
	private int id;
	private double valeur;
	public Devise(int id, double valeur) {
		super();
		this.id = id;
		this.valeur = valeur;
	}
	public Devise() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValeur() {
		return valeur;
	}
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	 

}
