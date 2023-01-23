package controller;

import javafx.application.Application;
import javafx.stage.Stage;


public class MainApp extends Application  {
	
	@Override
		public void start(Stage primaryStage) {
		
		try {
		// on lance la première page de l'application via l'appel au ControllerHome
		ControllerHome principal = new ControllerHome();
		principal.affHome(primaryStage);
	
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
		public static void main(String[] args) {
			launch(args);
			
			
		}
	}
