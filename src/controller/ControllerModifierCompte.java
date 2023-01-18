package controller;

import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import java.lang.ModuleLayer.Controller;


public class ControllerModifierCompte {
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
