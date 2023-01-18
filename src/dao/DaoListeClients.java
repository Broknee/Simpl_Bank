package dao;

import java.sql.*;


public class DaoListeClients extends Connexion {
			
	public void DisplayListeClients() {
	Connection conn=this.connecter();
	try
			{
				Statement stmt = conn.createStatement();
				ResultSet result = stmt.executeQuery("SELECT * FROM client;");
				System.out.println("Liste Clients");
				while (result.next()) {
					System.out.println(result.getInt("id_client"));
					System.out.println(result.getString("nom"));
					System.out.println(result.getString("prenom"));
					System.out.println(result.getString("mail"));
					System.out.println(result.getString("adresse"));
					System.out.println(result.getString("telephone"));
					System.out.println(result.getInt(1));
				}
			}
				
				catch(Exception e) 
				{
					System.out.println(e);
				}
			
	}
}