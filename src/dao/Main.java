package dao;



public class Main {

		 public static void main(String args[]) {
				
			DaoCreationBank client = new DaoCreationBank();
			client.getClient();
			
			DaoDebiterCompte debit = new DaoDebiterCompte();
			debit.debiter();
			
			DaoHome connexionEspace = new DaoHome();
			connexionEspace.ConnexionEspaceCompte();
			
			DaoListeClients listeClients = new DaoListeClients();
			listeClients.DisplayListeClients();
			
			DaoListeComptes listeComptes = new DaoListeComptes();
			listeComptes.DisplayListeComptes(); 
			 
			 DaoOuvrirCompte ouverture = new DaoOuvrirCompte();
			 ouverture.ouvrirCompte();
			 
			 DaoModifierCompte modif = new DaoModifierCompte();
			 modif.modifierCompte(); 
			 
			 DaoTransfert transfert = new DaoTransfert();
			 transfert.transfertCompte();  
			 
			 
	} 
	}


