package dao;

import java.sql.Connection;
import java.sql.Statement;

public class DaoTransfert extends Connexion {

		public void transfertCompte() {
			Connection conn=this.connecter();
			try
					{
						Statement stmt = conn.createStatement();
						String sqlDebit = "INSERT INTO mouvement VALUES(NULL,NOW(),'débit',200.00,2,3);";
						String sqlDebitUpdate = "UPDATE compte SET solde_actuel=100 WHERE id_compte =2;";
						String sqlCredit = "INSERT INTO mouvement VALUES(NULL,NOW(),'crédit',200.00,3,2)";
						String sqlCreditUpdate = "UPDATE compte SET solde_actuel=400 WHERE id_compte =3;";
						stmt.executeUpdate(sqlDebit);
						stmt.executeUpdate(sqlDebitUpdate);
						stmt.executeUpdate(sqlCredit);
						stmt.executeUpdate(sqlCreditUpdate);
						if(stmt!=null) {
							System.out.println("Le transfert a bien été effectué");
						}
					}
						
						catch(Exception e) 
						{
							System.out.println(e);
						}
					
			}
	}


