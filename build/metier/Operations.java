package metier;

public class Operations {
	private int id;
	private String dateOperation;
	private String typeOperation;
	private double montantOperation;
	public Operations(int id, String dateOperation, String typeOperation, double montantOperation) {
		super();
		this.id = id;
		this.dateOperation = dateOperation;
		this.typeOperation = typeOperation;
		this.montantOperation = montantOperation;
	}
	public Operations() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}
	public String getTypeOperation() {
		return typeOperation;
	}
	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}
	public double getMontantOperation() {
		return montantOperation;
	}
	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}
	
	

}
