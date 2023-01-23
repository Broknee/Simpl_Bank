package controller;


import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerDashboard {

	@FXML 
	Button ouvrirCompte;
	@FXML
	Button debiterCompte;
	@FXML
	Button crediterCompte;
	@FXML
	Button transfererCompte;
	@FXML
	Button modifierCompte;
	@FXML
	Button cloturerCompte;
	

	
	public void affDashboard() {
		try {
			AnchorPane secondaryLayout = new AnchorPane();
			secondaryLayout = FXMLLoader.load(getClass().getResource("/view/ViewDashboard.fxml"));

			Scene modifierCompteScene = new Scene(secondaryLayout, 700, 500);

			// New window (Stage)
			Stage newWindow = new Stage();
			newWindow.setTitle("Tableau de bord");
			newWindow.setScene(modifierCompteScene);

			newWindow.show();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void ouvrir(ActionEvent event) {
			ControllerOuvrirCompte ouvrirC = new ControllerOuvrirCompte();
			ouvrirC.affCreationCompte();
		}
	
	public void modifier(ActionEvent event) {
		ControllerModifierCompte modif = new ControllerModifierCompte();
		modif.affModif();
	}
	
	public void cloturer(ActionEvent event) {
		ControllerCloturerCompte cloture = new ControllerCloturerCompte();
		cloture.affCloturer();
	}
	
	public void debiter(ActionEvent event) {
		ControllerDebiterCompte debit = new ControllerDebiterCompte();
		debit.affDebiter();
	}
	
	public void crediter(ActionEvent event) {
		ControllerCrediterCompte credit = new ControllerCrediterCompte();
		credit.affCrediter();
	}
	
	public void transferer(ActionEvent event) {
		ControllerTransfert transfert = new ControllerTransfert();
		transfert.affTransfert();
	}
	
}

