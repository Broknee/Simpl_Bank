package dao;

import java.sql.*;

public class DaoOuvrirCompte extends Connexion{
		
	
	
	
	public boolean ouvrirCompte(String typeCompte, double soldeActuel,double soldem,double frais, double tauxC,double plafondMax,String nom) {
	Connection conn=this.connecter();
	try
			{
				Statement stmt = conn.createStatement();
				String sqlInsert = "INSERT INTO compte VALUES (NULL,TRUNCATE(RAND()*1000000,0),'"+typeCompte+"',"+frais+","+soldem+","+tauxC+","+plafondMax+",1,'"+nom+"',"+soldeActuel+")";
				stmt.executeUpdate(sqlInsert);
				if(stmt!=null) {
					System.out.println("Le compte a été créé");
					return true;
				} else {
					System.out.println("Une erreur s'est produite");
		    	}
			}
				
				catch(Exception e) 
				{
					System.out.println(e);
				}
	return false;
			
	
	}
}
