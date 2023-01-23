package controller;

import java.io.IOException;

import dao.DaoCreerClient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.ModelClient;

public class ControllerCreerClient {
	@FXML 
	private TextField nomClient;
	@FXML
	private TextField prenomClient;
	@FXML 
	private TextField raisonSociale;
	
	 String nom;
	 String prenom;
	 String raisonSoc;
	 
	 
	 public void affCreationClient() {
			try {
			
				
				AnchorPane secondaryLayout = new AnchorPane();
				secondaryLayout = FXMLLoader.load(getClass().getResource("/view/ViewCreerClient.fxml"));

				Scene ouvrirCompteScene = new Scene(secondaryLayout, 700, 750);

				// New window (Stage)
				Stage newWindow = new Stage();
				newWindow.setTitle("Créer un client");
				newWindow.setScene(ouvrirCompteScene);

				

				newWindow.show();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }

			
		
	 
	 
	 public void submitCreerClient(ActionEvent event) {
		
	 
	 if(nomClient.getText().isEmpty() || prenomClient.getText().isEmpty() ||  raisonSociale.getText().isEmpty()) 
	 {
		 System.out.println("Vous devez remplir tous les champs pour créer un compte");
	 } 
	 else {
		 	nom = nomClient.getText();
		 	ModelClient client = new ModelClient();
		 	client.setNom(nom);
		 	
		 	prenom = prenomClient.getText();
		 	client.setPrenom(prenom);
		 	
		 	raisonSoc = raisonSociale.getText();
		 	client.setRaisonSociale(raisonSoc);
		 	
		 	DaoCreerClient creationClient = new DaoCreerClient();
			creationClient.creerClient(nom, prenom, raisonSoc);
			
			
	 }
	 }
}
