package dao;

import java.sql.*;

public class DaoCrediterCompte extends Connexion {
            
    public void crediterCompte(int idCompte, double montant) {
    Connection conn=this.connecter();
    try
            {
                Statement stmt = conn.createStatement();
                String sqlInsert = "INSERT INTO mouvement VALUES(NULL,NOW(),'crédit',"+montant+" ,"+idCompte+" , null);";
                stmt.executeUpdate(sqlInsert);
                
                
                ResultSet result = stmt.executeQuery("SELECT solde_actuel FROM compte WHERE id_compte =  "+idCompte+"");
                result.next();
                double soldeActuel = result.getDouble(1) ;
                soldeActuel = soldeActuel + montant;
                String sqlUpdate = "UPDATE compte SET solde_actuel= "+soldeActuel+" WHERE id_compte ="+idCompte+" ;";
                
                stmt.executeUpdate(sqlUpdate);
                        
                System.out.println("Le compte numero "+idCompte+"  a ete credite de  "+montant+"  euros. Votre solde actuel est de  "+soldeActuel+" ");
            }
                
                catch(Exception e) 
                {
                    System.out.println(e);
                }
            
    }
}