package dao;

import java.sql.*;


public class DaoDebiterCompte extends Connexion {
			
	public void debiter() {
	Connection conn=this.connecter();
	try
			{
				Statement stmt = conn.createStatement();
				String sqlInsert = "INSERT INTO mouvement VALUES(NULL,NOW(),'débit',200.00,2,null);";
				String sqlUpdate = "UPDATE compte SET solde_actuel=300 WHERE id_compte =2;";
				stmt.executeUpdate(sqlInsert);
				stmt.executeUpdate(sqlUpdate);
				if(stmt!=null) {
					System.out.println("Vous avez bien été débité.");
				}
			}
				
				catch(Exception e) 
				{
					System.out.println(e);
				}
			
	}
}