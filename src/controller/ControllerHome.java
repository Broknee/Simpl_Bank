package controller;
import javafx.event.ActionEvent;
import java.io.IOException;

import dao.DaoHome;
import javafx.stage.Stage;
import model.ModelBanque;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class ControllerHome {
	
	private Stage primaryStage;
	
	@FXML 
	private TextField raison_sociale;
	@FXML 
	private TextField mdp;
	@FXML 
	private Button submit;
	
	String raison;
	String password;

	public void submitHome(ActionEvent event)
	{
		if(raison_sociale.getText().isEmpty() || mdp.getText().isEmpty())
		{
			System.out.println("Vous devez remplir tous les champs pour vous connecter");
		} else {
			raison = raison_sociale.getText();
			ModelBanque raison_sociale = new ModelBanque();
			raison_sociale.setRaisonSociale(raison);
			password = mdp.getText();
			ModelBanque mdp = new ModelBanque();
			mdp.setMdp(password);
			DaoHome verifBanque = new DaoHome();
		if(	verifBanque.ConnexionEspaceCompte(raison,password)) 
			{
				ControllerDashboard dashboard = new ControllerDashboard();
				dashboard.affDashboard();
			};
			

		}
	}
	
	
	public void affHome(Stage primaryStage) {
		try {
			primaryStage.setTitle("Home");
			Parent root = FXMLLoader.load(getClass().getResource("/view/ViewHome.fxml"));
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
