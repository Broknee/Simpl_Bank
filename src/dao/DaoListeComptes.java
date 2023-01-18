package dao;

import java.sql.*;


public class DaoListeComptes extends Connexion {
			
	public void DisplayListeComptes() {
	Connection conn=this.connecter();
	try
			{
				Statement stmt = conn.createStatement();
				ResultSet result = stmt.executeQuery("SELECT * FROM compte;");
				System.out.println("liste comptes");
				while (result.next()) {
					System.out.println(result.getInt("id_compte"));
					System.out.println(result.getString("code_compte"));
					System.out.println(result.getString("type"));
					System.out.println(result.getDouble("frais_transfert"));
					System.out.println(result.getInt("solde_min"));
					System.out.println(result.getDouble("taux"));
					System.out.println(result.getInt("plafond"));
					System.out.println(result.getInt("#id_client"));
					System.out.println(result.getDouble("solde_actuel"));

				}
			}
				
				catch(Exception e) 
				{
					System.out.println(e);
				}
			
	}
}