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
	private TextField fraisTransfert;
	@FXML 
	private TextField soldeMini;
	@FXML
	private TextField plafond;
	@FXML 
	private TextField type;
	@FXML
	private Button enregistrer;
	
	 String typeCompte;
	 String soldeMinimum;
	 String plafondMax;
	 String frais;
	
	
	
	
	
	 public void submitModif(ActionEvent event) {
		
		 
		 if (!type.getText().isEmpty()) {
			 	typeCompte = type.getText();
			 	ModelCompte type = new ModelCompte();
				type.setType(typeCompte);	
				DaoModifierCompte modifCompte = new DaoModifierCompte();
				modifCompte.modifierTypeCompte(typeCompte);
		 }
		  if  (!soldeMini.getText().isEmpty()) {
			  soldeMinimum= soldeMini.getText();
		 	double soldem = Double.parseDouble(soldeMinimum);
		 	ModelCompte soldeMin = new ModelCompte();
			soldeMin.setSoldeMinimum(soldem);
			DaoModifierCompte modifSoldeCompte = new DaoModifierCompte();
			modifSoldeCompte.modifierSoldeCompte(soldem);
		 }
		if (!fraisTransfert.getText().isEmpty()) 
		{
			frais = fraisTransfert.getText();
			double fraisT = Double.parseDouble(frais);
			DaoModifierCompte fraisDeTransfert = new DaoModifierCompte();
			fraisDeTransfert.modifierFraisCompte(fraisT);
		}
		if (!plafond.getText().isEmpty()) 
		{
			plafondMax= plafond.getText();
			double plafondM = Double.parseDouble(plafondMax);
			DaoModifierCompte plafond = new DaoModifierCompte();
			plafond.modifierPlafondCompte(plafondM);
	}
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
