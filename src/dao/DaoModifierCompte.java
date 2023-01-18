package dao;

import java.sql.Connection;
import java.sql.Statement;

public class DaoModifierCompte extends Connexion {
	public void modifierCompte() {
		Connection conn=this.connecter();
		try
				{
					Statement stmt = conn.createStatement();
					String sqlUpdate = "UPDATE client SET nom=\"Mass\",prenom=\"Marinette\",mail=\"massette.marinette@mail.com\" WHERE id_client =1";
					stmt.executeUpdate(sqlUpdate);
					if(stmt!=null) {
						System.out.println("Les informations client ont bien été modifiées");
					}
				}
					
					catch(Exception e) 
					{
						System.out.println(e);
					}
				
		}
}
