package model;

public class ModelCompte {
	public int getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	public String getCodeCompte() {
		return codeCompte;
	}
	public void setCodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getFraisTransfert() {
		return fraisTransfert;
	}
	public void setFraisTransfert(double fraisTransfert) {
		this.fraisTransfert = fraisTransfert;
	}
	public double getSoldeMinimum() {
		return soldeMinimum;
	}
	public void setSoldeMinimum(double soldeMinimum) {
		this.soldeMinimum = soldeMinimum;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public double getPlafond() {
		return plafond;
	}
	public void setPlafond(double plafond) {
		this.plafond = plafond;
	}
	public double getSoldeActuel() {
		return soldeActuel;
	}
	public void setSoldeActuel(double soldeActuel) {
		this.soldeActuel = soldeActuel;
	}
	private	int idCompte;
	private	String codeCompte;
	private	String type;
	private	double fraisTransfert;
	private	double soldeMinimum;
	private	double taux;
	private	double plafond;
	private	double soldeActuel;
		
}
