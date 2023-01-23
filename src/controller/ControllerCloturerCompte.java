package controller;

import java.io.IOException;

import dao.DaoCloturerCompte;
import dao.DaoModifierCompte;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.ModelCompte;

public class ControllerCloturerCompte {

	@FXML 
	private TextField numeroCompte;
	
	String numCompte;
	
	
    public void SubmitCloturer(ActionEvent event) {    
    	// methode permettant de récupérer l'entrée utilisateur et d'appeler le DAO pour le traitement
    	numCompte =numeroCompte.getText();
        DaoCloturerCompte cloturerCompte = new DaoCloturerCompte();
        cloturerCompte.cloturerCompte(numCompte);
    }
    
    public void affCloturer() {
    	// affichage de la page Cloture du compte
        try {
        	// création d'une nouvelle ancre 
        	AnchorPane secondaryLayout = new AnchorPane();
        	// on charge la view fxml puis on la place dans une variable de type AnchorPane
			secondaryLayout = FXMLLoader.load(getClass().getResource("/view/ViewCloturerCompte.fxml"));
			// creation d'une instance de la classe Scene
			Scene modifierCompteScene = new Scene(secondaryLayout, 700, 500);

			// New window (Stage)
			Stage newWindow = new Stage();
			newWindow.setTitle("Tableau de bord");
			newWindow.setScene(modifierCompteScene);

			newWindow.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}