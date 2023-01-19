package controller;


import javafx.event.ActionEvent;
import java.io.IOException;

import dao.DaoModifierCompte;
import javafx.stage.Stage;
import model.ModelCompte;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;



public class ControllerModifierCompte {
	
	
	
	
	@FXML 
	private TextField type;
	@FXML
	private Button enregistrer;
	
	String typeCompte;
	
	
	 public void submitModif(ActionEvent event) {
		typeCompte = type.getText();
		ModelCompte type = new ModelCompte();
		type.setType(typeCompte);	
		DaoModifierCompte modifCompte = new DaoModifierCompte();
		modifCompte.modifierCompte(typeCompte);
	}
	
	
	
	
	public void affModif(Stage primaryStage) {
		try {
			primaryStage.setTitle("Modifier Compte");
			Parent root = FXMLLoader.load(getClass().getResource("/view/ViewModifierCompte.fxml"));
			Scene scene = new Scene(root,700,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	


	
	
	
	
}
