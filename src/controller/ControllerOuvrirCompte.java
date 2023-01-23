package controller;

import java.awt.Label;
import java.io.IOException;
import dao.DaoOuvrirCompte;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.ModelClient;
import model.ModelCompte;

public class ControllerOuvrirCompte {

	
	@FXML 
	private TextField nomClient;
	@FXML
	private TextField fraisTransfert;
	@FXML 
	private TextField soldeMini;
	@FXML
	private TextField plafond;
	@FXML 
	private TextField type;
	@FXML 
	private TextField taux;
	@FXML 
	private TextField soldeActuel;
	@FXML
	private Button enregistrer;
	
	 String typeCompte;
	 String soldeMinimum;
	 String plafondMax;
	 String frais;
	 String tauxCompte;
	 String nom;
	 String soldeDepart;
	 
	 
	 
	 
	 public void affCreationCompte() {
			try {
				
				AnchorPane secondaryLayout = new AnchorPane();
				secondaryLayout = FXMLLoader.load(getClass().getResource("/view/ViewOuvrirCompte.fxml"));

				Scene ouvrirCompteScene = new Scene(secondaryLayout, 700, 750);

				// New window (Stage)
				Stage newWindow = new Stage();
				newWindow.setTitle("Ouvrir un compte");
				newWindow.setScene(ouvrirCompteScene);

				

				newWindow.show();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	 
	 
	 public void submitCreation(ActionEvent event) {
		
	 
	 if(type.getText().isEmpty() || soldeMini.getText().isEmpty() || fraisTransfert.getText().isEmpty() || plafond.getText().isEmpty() || taux.getText().isEmpty() || nomClient.getText().isEmpty() || soldeActuel.getText().isEmpty()) 
	 {
		 System.out.println("Vous devez remplir tous les champs pour créer un compte");
	 } 
	 else {
		 	typeCompte = type.getText();
		 	ModelCompte type = new ModelCompte();
			type.setType(typeCompte);	
			
			soldeMinimum = soldeMini.getText();
			double soldem = Double.parseDouble(soldeMinimum);
		 	ModelCompte soldeMin = new ModelCompte();
			soldeMin.setSoldeMinimum(soldem);
			
			soldeDepart = soldeActuel.getText();
			double soldeActuel = Double.parseDouble(soldeDepart);
		 	ModelCompte soldeA = new ModelCompte();
			soldeA.setSoldeMinimum(soldeActuel);
			
			frais = fraisTransfert.getText();
			double fraisT = Double.parseDouble(frais);
			ModelCompte fraisTrans = new ModelCompte();
			fraisTrans.setFraisTransfert(fraisT);
			
			tauxCompte = taux.getText();
			double tauxC = Double.parseDouble(tauxCompte);
			ModelCompte tauxT = new ModelCompte();
			tauxT.setTaux(tauxC);
			
			plafondMax= plafond.getText();
			double plafondM = Double.parseDouble(plafondMax);
			ModelCompte plaf = new ModelCompte();
			plaf.setPlafond(plafondM);
			
			nom = nomClient.getText();
			ModelClient nomCli = new ModelClient();
			nomCli.setNom(nom);
			
			DaoOuvrirCompte creationCompte = new DaoOuvrirCompte();
			creationCompte.ouvrirCompte(typeCompte,soldeActuel,soldem,fraisT,plafondM,tauxC,nom);
		
	 }
		 
		
		}

	 }
	
	
	 
	 
	 
	 
	 


