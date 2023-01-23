package controller;

import java.io.IOException;

import dao.DaoCrediterCompte;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.ModelCompte;
import model.ModelMouvement;

public class ControllerCrediterCompte {
    
    @FXML 
    private TextField idCpt;
    @FXML
    private TextField somme;
    @FXML
    private Button valider;
    
    int idCompte;
    double montant;
    
    
     public void crediter(ActionEvent event) {
        idCompte = Integer.parseInt(idCpt.getText());
        ModelCompte compte = new ModelCompte();
        compte.setIdCompte(idCompte);
        
        montant = Double.parseDouble(somme.getText());
        ModelMouvement mouvement = new ModelMouvement();
        mouvement.setMontant(montant);
        
        DaoCrediterCompte crediter = new DaoCrediterCompte();
        crediter.crediterCompte(idCompte, montant);
    }
    
     public void affCrediter() {
 		try {
 			AnchorPane secondaryLayout = new AnchorPane();
 			secondaryLayout = FXMLLoader.load(getClass().getResource("/view/ViewCrediterCompte.fxml"));

 			Scene modifierCompteScene = new Scene(secondaryLayout, 700, 500);

 			// New window (Stage)
 			Stage newWindow = new Stage();
 			newWindow.setTitle("Créditer Compte");
 			newWindow.setScene(modifierCompteScene);

 			newWindow.show();
 			
 			
 		} catch (IOException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		
 	}
}