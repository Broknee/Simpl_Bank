package model;

public class ModelMouvement {
		public int getIdMouvement() {
		return idMouvement;
	}
	public void setIdMouvement(int idMouvement) {
		this.idMouvement = idMouvement;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTypeMouvement() {
		return typeMouvement;
	}
	public void setTypeMouvement(String typeMouvement) {
		this.typeMouvement = typeMouvement;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public int getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	public int getIdCompteD() {
		return idCompteD;
	}
	public void setIdCompteD(int idCompteD) {
		this.idCompteD = idCompteD;
	}
		private int idMouvement;
		private String date;
		private String typeMouvement;
		private double montant;
		private int idCompte;
		private int idCompteD;
}
