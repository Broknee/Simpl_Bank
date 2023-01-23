package dao;

import java.sql.Connection;
import java.sql.Statement;


public class DaoModifierCompte extends Connexion {
	
	
	
	
	public void modifierTypeCompte(String typeCompte,int idCompte) {
		Connection conn=this.connecter();
		try
				{
					Statement stmt = conn.createStatement();
					System.out.println(typeCompte);
					String sqlUpdate = "UPDATE compte SET type = '"+typeCompte+"' WHERE id_compte = "+idCompte+"";
					stmt.executeUpdate(sqlUpdate);
					if(stmt!=null) {
					System.out.println("Le type de compte a bien été modifié");
					}
				}
					catch(Exception e) 
					{
						System.out.println(e);
					}
				
		}
	
	public void modifierSoldeCompte(double soldem,int idCompte) {

		Connection conn=this.connecter();
		try
				{
					Statement stmt = conn.createStatement();
					System.out.println(soldem);
					String sqlUpdate = "UPDATE compte SET solde_min = "+soldem+" WHERE id_compte = "+idCompte+"";
					stmt.executeUpdate(sqlUpdate);
					if(stmt!=null) {
						System.out.println("Le solde minimum a bien été modifié");
					}
				}
					
					catch(Exception e) 
					{
						System.out.println(e);
					}
				
		}
	
	public void modifierFraisCompte(double fraisT, int idCompte) {

		Connection conn=this.connecter();
		try
				{
					Statement stmt = conn.createStatement();
					System.out.println(fraisT);
					String sqlUpdate = "UPDATE compte SET frais_transfert = "+fraisT+" WHERE id_compte = "+idCompte+"";
					stmt.executeUpdate(sqlUpdate);
					if(stmt!=null) {
						System.out.println("Les frais de transfert ont bien été modifiés");
					}
				}
					
					catch(Exception e) 
					{
						System.out.println(e);
					}
				
		}

	public void modifierPlafondCompte(double plafondMax,int idCompte) {

		Connection conn=this.connecter();
		try
				{
					Statement stmt = conn.createStatement();
					System.out.println(plafondMax);
					String sqlUpdate = "UPDATE compte SET plafond = "+plafondMax+" WHERE id_compte = "+idCompte+"";
					stmt.executeUpdate(sqlUpdate);
					if(stmt!=null) {
						System.out.println("Le plafond a bien été modifié");
					}
				}
					
					catch(Exception e) 
					{
						System.out.println(e);
					}
				
		}
	
	public void modifierTauxCompte(double tauxCompte,int idCompte) {

		Connection conn=this.connecter();
		try
				{
					Statement stmt = conn.createStatement();
					System.out.println(tauxCompte);
					String sqlUpdate = "UPDATE compte SET taux= "+tauxCompte+" WHERE id_compte = "+idCompte+"";
					stmt.executeUpdate(sqlUpdate);
					if(stmt!=null) {
						System.out.println("Le taux a bien été modifié");
					}
				}
					
					catch(Exception e) 
					{
						System.out.println(e);
					}
				
		}



}
	
	
	
	

