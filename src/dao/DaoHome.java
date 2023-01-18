package dao;

import java.sql.*;


public class DaoHome extends Connexion {
			
	public void ConnexionEspaceCompte() {
	Connection conn=this.connecter();
	try
			{
				Statement stmt = conn.createStatement();
				ResultSet result = stmt.executeQuery("SELECT * FROM banque;");
				
				while (result.next()) {
					System.out.println(result.getInt(1));
					System.out.println(result.getString("raison_sociale"));
					System.out.println(result.getString("mdp"));
				}
				if(stmt!=null) {
					//if (raison_sociale && mdp === données form) {connecté à l'espace}
					System.out.println("Vous êtes connecté à votre espace.");
				}
			}
				
				catch(Exception e) 
				{
					System.out.println(e);
				}
			
	}
}