package controller;

import javafx.event.ActionEvent;
import java.io.IOException;
import dao.DaoModifierCompte;
import javafx.stage.Stage;
import model.ModelCompte;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
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
	@FXML
	private TextField idcompte;
	@FXML
	private TextField taux;
	
	
	 String typeCompte;
	 double soldem;
	 double plafondM;
	 double fraisT;
	 int IdCompte;
	 double tauxCompte;
	
	
	
	
	
	 public void submitModif(ActionEvent event) {
		
		 if(!idcompte.getText().isEmpty()) {
			 IdCompte =Integer.parseInt(idcompte.getText());
			 ModelCompte compte = new ModelCompte();
		       compte.setIdCompte(IdCompte);
		 } 
		 
		 if (!type.getText().isEmpty()) {
			 	typeCompte = type.getText();
			 	ModelCompte type = new ModelCompte();
				type.setType(typeCompte);	
				DaoModifierCompte modifCompte = new DaoModifierCompte();
				modifCompte.modifierTypeCompte(typeCompte,IdCompte);
		 }
		  if  (!soldeMini.getText().isEmpty()) {
		 	 soldem = Double.parseDouble( soldeMini.getText());
		 	ModelCompte soldeMin = new ModelCompte();
			soldeMin.setSoldeMinimum(soldem);
			DaoModifierCompte modifSoldeCompte = new DaoModifierCompte();
			modifSoldeCompte.modifierSoldeCompte(soldem,IdCompte);
		 }
		if (!fraisTransfert.getText().isEmpty()) 
		{
			fraisT = Double.parseDouble(fraisTransfert.getText());
			DaoModifierCompte fraisDeTransfert = new DaoModifierCompte();
			fraisDeTransfert.modifierFraisCompte(fraisT,IdCompte);
		}
		if (!plafond.getText().isEmpty()) 
		{
			plafondM = Double.parseDouble(plafond.getText());
			DaoModifierCompte plafond = new DaoModifierCompte();
			plafond.modifierPlafondCompte(plafondM,IdCompte);
	}
		if (!taux.getText().isEmpty()) 
		{
			tauxCompte = Double.parseDouble(taux.getText());
			DaoModifierCompte taux = new DaoModifierCompte();
			taux.modifierTauxCompte(tauxCompte,IdCompte);
	}
	 }
	
	
	
	
	public void affModif() {
		try {
		
			AnchorPane secondaryLayout = new AnchorPane();
			secondaryLayout = FXMLLoader.load(getClass().getResource("/view/ViewModifierCompte.fxml"));

			Scene modifierCompteScene = new Scene(secondaryLayout, 700, 500);

			// New window (Stage)
			Stage newWindow = new Stage();
			newWindow.setTitle("Ouvrir un compte");
			newWindow.setScene(modifierCompteScene);

			

			newWindow.show();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	


	
	
	
	
}
