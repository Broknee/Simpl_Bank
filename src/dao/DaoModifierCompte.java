package dao;

import java.sql.Connection;
import java.sql.Statement;
import model.ModelCompte;

public class DaoModifierCompte extends Connexion {
	
	
	
	
	public void modifierCompte(String typeCompte) {
		Connection conn=this.connecter();
		try
				{
					Statement stmt = conn.createStatement();
					System.out.println(typeCompte);
					String sqlUpdate = "UPDATE compte SET type=\"Epargne\"  WHERE id_client =1";
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
