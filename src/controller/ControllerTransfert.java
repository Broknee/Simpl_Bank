package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.ModelCompte;
import model.ModelMouvement;
import dao.DaoTransfert;

public class ControllerTransfert {
    
    @FXML 
    private TextField idSender;
    @FXML 
    private TextField idReceiver;
    @FXML
    private TextField somme;
    @FXML
    private Button transferer;
    
    
    int idSend;
    int idReceive;
    double montant;
    
    
     public void transferer(ActionEvent event) {
        idSend = Integer.parseInt(idSender.getText());
        idReceive = Integer.parseInt(idReceiver.getText());
        ModelCompte compte = new ModelCompte();
        compte.setIdCompte(idSend);
        compte.setIdCompte(idReceive);
        
        montant = Double.parseDouble(somme.getText());
        ModelMouvement mouvement = new ModelMouvement();
        mouvement.setMontant(montant);
        
        DaoTransfert transferer = new DaoTransfert();
        transferer.transfertCompte(idSend, idReceive, montant);
    }
    
    public void affTransfert() {
        try {
        	AnchorPane secondaryLayout = new AnchorPane();
 			secondaryLayout = FXMLLoader.load(getClass().getResource("/view/ViewTransfert.fxml"));

 			Scene modifierCompteScene = new Scene(secondaryLayout, 700, 500);

 			// New window (Stage)
 			Stage newWindow = new Stage();
 			newWindow.setTitle("Transfert Compte");
 			newWindow.setScene(modifierCompteScene);

 			newWindow.show();
 			
 			
 		} catch (IOException e) {
 			// TODO Auto-generated catch block
 		e.printStackTrace();
 		}
    }
    }
 		
