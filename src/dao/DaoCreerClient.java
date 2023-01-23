package dao;

import java.sql.Connection;
import java.sql.Statement;

public class DaoCreerClient extends Connexion {
	public void creerClient(String nom, String prenom, String raisonSociale) {
		Connection conn=this.connecter();
		try
				{
					Statement stmt = conn.createStatement();
					String sqlInsert = "INSERT INTO client VALUES (NULL,'"+nom+"', '"+prenom+"',1,'"+raisonSociale+"')";
					stmt.executeUpdate(sqlInsert);
						System.out.println("Le client a été créé");
		
				}
					
					catch(Exception e) 
					{
						System.out.println(e);
					}

				
		
		}
}
