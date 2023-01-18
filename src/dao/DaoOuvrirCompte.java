package dao;

import java.sql.*;

public class DaoOuvrirCompte extends Connexion{
	public void ouvrirCompte() {
	Connection conn=this.connecter();
	try
			{
				Statement stmt = conn.createStatement();
				String sqlInsert = "INSERT INTO compte VALUES (NULL,TRUNCATE(RAND()*1000000,0),'courant',1.20,0,NULL,NULL,1,200.00)";
				stmt.executeUpdate(sqlInsert);
				if(stmt!=null) {
					System.out.println("Le compte a été créé");
				} else {
					System.out.println("Une erreur s'est produite");
				}
			}
				
				catch(Exception e) 
				{
					System.out.println(e);
				}
			
	}
}
