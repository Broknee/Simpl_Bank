package dao;

import java.sql.*;


public class DaoHome extends Connexion {
			
	public void ConnexionEspaceCompte(String raison_sociale, String mdp) {
	Connection conn=this.connecter();
	try
			{
				Statement stmt = conn.createStatement();
				ResultSet result = stmt.executeQuery("SELECT * FROM banque WHERE id_banque = 1;");
				while (result.next()) {
				String raisonBanque =	result.getString("raison_sociale");
				String mdpBanque =	result.getString("mdp");
				
				if (raisonBanque.equals(raison_sociale)  && mdpBanque.equals(mdp)) {
					System.out.println("Vous êtes connecté à votre espace.");
					
				} else {
					System.out.println("Les données rentrées ne correspondent pas");
				}
				}
			}
				
				catch(Exception e) 
				{
					System.out.println(e);
				}
			
	}
}