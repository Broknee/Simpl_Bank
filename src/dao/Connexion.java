package dao;
import java.sql.Connection;
import java.sql.DriverManager;


 	


public class Connexion {
	private String  BDD = "simpl_bank";
	private String  url = "jdbc:mysql://127.0.0.1:3306/" + BDD;
	private String user = "root";
	private String passwd = "";
	 
	
	  
	public Connection connecter()
	 {
		
		 try {
			    Class.forName("com.mysql.cj.jdbc.Driver");
			   Connection conn = DriverManager.getConnection(url, user, passwd);
			    System.out.println("Vous êtes connecté à la base de données");
			    return conn;
				   
			} catch (Exception e){
			    e.printStackTrace();
			    System.out.println("Erreur");
			    System.exit(0);
			    return null;
			}
		
	 }
	
	 
}