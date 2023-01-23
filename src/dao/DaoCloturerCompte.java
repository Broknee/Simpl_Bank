package dao;

import java.sql.*;


public class DaoCloturerCompte extends Connexion {
            
    public void cloturerCompte(String numCompte) {
    	// connexion à la BDD via la classe Connection
    Connection conn=this.connecter();
    try
            {
                Statement stmt = conn.createStatement();
                stmt.executeUpdate("DELETE FROM compte WHERE id_compte = '"+numCompte+"';");
                System.out.println("Le compte n°"+numCompte+" a été supprimé");
            }
                
                catch(Exception e) 
                {
                    System.out.println(e);
                }
            
    }
}