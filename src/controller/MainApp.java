package controller;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class MainApp extends Application {
	@Override
		public void start(Stage primaryStage) {
		
		try {
			
			ControllerModifierCompte modif = new ControllerModifierCompte();
			modif.affModif(primaryStage);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
		public static void main(String[] args) {
			launch(args);
			
			
		}
	}
