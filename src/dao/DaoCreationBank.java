package dao;

import java.sql.*;


public class DaoCreationBank extends Connexion {
			
	public void getClient() {
	Connection conn=this.connecter();
	try
			{
				Statement stmt = conn.createStatement();
				ResultSet result = stmt.executeQuery("Select * FROM client");
				while (result.next()) {
					System.out.println(result.getInt(1));
					System.out.println(result.getString("nom"));
				}
			}
				
				catch(Exception e) 
				{
					System.out.println(e);
				}
			
	}
}

