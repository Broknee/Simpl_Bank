package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DaoTransfert extends Connexion {

		public void transfertCompte(int idSend, int idReceive, double montant) {
			Connection conn=this.connecter();
			try
					{
				//insère mouvements de débit et crédit dans la table mouvement sur les comptes de l'expéditeur et du destinataire
				Statement stmt = conn.createStatement();
				String sqlInsertSender = "INSERT INTO mouvement VALUES(NULL,NOW(),'débit', "+montant+" , "+idSend+" , null);";
				stmt.executeUpdate(sqlInsertSender);
				String sqlInsertReceiver = "INSERT INTO mouvement VALUES(NULL,NOW(),'crédit',"+montant+" , "+idReceive+" , null);";
				stmt.executeUpdate(sqlInsertReceiver);
				
				//Récupère le solde actuel avant transaction sur le compte de l'expéditeur
       			ResultSet resultSender = stmt.executeQuery("SELECT solde_actuel FROM compte WHERE id_compte =  "+idSend+" ");
				resultSender.next();
				double soldeActuelSender = resultSender.getDouble(1) ;
				//calcule le solde actuel après débit
				soldeActuelSender = soldeActuelSender - montant;
				//actualise le solde actuel sur le compte de l'expéditeur
				String sqlUpdateSender = "UPDATE compte SET solde_actuel= "+soldeActuelSender+"  WHERE id_compte = "+idSend+" ;";
				stmt.executeUpdate(sqlUpdateSender);
						
				System.out.println("Le compte numero "+idSend+"  a ete debite de "+montant+" euros. Votre solde actuel est de  "+soldeActuelSender+"  euros");
				
				//Récupère le solde actuel avant transaction sur le compte du destinataire
				ResultSet resultReceive = stmt.executeQuery("SELECT solde_actuel FROM compte WHERE id_compte = "+idReceive+" ");
				resultReceive.next();
				double soldeActuelReceiver = resultReceive.getDouble(1) ;
				//calcule le solde actuel après crédit
				soldeActuelReceiver = soldeActuelReceiver + montant;
				//actualise le solde actuel sur le compte du destinataire
				String sqlUpdateReceiver = "UPDATE compte SET solde_actuel="+soldeActuelReceiver+"  WHERE id_compte = "+idReceive+" ;";
				stmt.executeUpdate(sqlUpdateReceiver);
						
				System.out.println("Le compte numero "+idReceive+"  a ete credite de  "+montant+" euros.");
					}
						
						catch(Exception e) 
						{
							System.out.println(e);
						}
					
			}
	}


