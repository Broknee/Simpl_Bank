package controller;

import javafx.application.Application;
import javafx.stage.Stage;


public class MainApp extends Application {
	@Override
		public void start(Stage primaryStage) {
		
		try {
			
			ControllerHome principal = new ControllerHome();
			principal.affHome(primaryStage);
			
			// vers la page modifier compte
		/*	ControllerModifierCompte modif = new ControllerModifierCompte();
			modif.affModif(primaryStage);
			*/
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
		public static void main(String[] args) {
			launch(args);
			
			
		}
	}
