package daoMySQL;

import dao.Connexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnexionMySQL implements Connexion {

    private Connection conn; //objet de connexion à la BDD
    private Statement stat;//objet permettant d'effectuer des requêtes simples
    private boolean connected;//variable permettant de savoir si on est connecté à une BDD
    private String url;

    private static ConnexionMySQL uniqueInstance = new ConnexionMySQL();
    private static ConnexionMySQL connexionMySQL;
    

    /* Constructeur : ouvre la connexion */
    private ConnexionMySQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException classe) {
            System.out.println(classe.toString());
        }
        connected = false;

        url = "jdbc:mysql://localhost/tfe_memoir"; //en local
        //String url = "jdbc:mysql://sql.info.iepscf-uccle.be/sonneville"; //à l'école
        try {
            /* setup the properties: si les accents ne sont pas Unicode ds la BDD
             java.util.Properties prop = new java.util.Properties();
             prop.put("charSet", "ISO-8859-15");
             prop.put("user", username);
             prop.put("password", password);*/

            // Connect to the database
            conn = DriverManager.getConnection(url, "root", ""); //en local
            //conn=DriverManager.getConnection(url, "sonneville",""); // à l'école

            stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //on peut parcourir le résultat dans les 2 sens, insensible aux chgmts d'autrui
            //on peut modifier ce résultat pour ensuite reporter ces modifs ds la table (updateRow)
            conn.setAutoCommit(false);
            connected = true;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    /* ferme la connexion. */
    public void close() {
        try {
            conn.close();
            connected = false;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    /* Pattern Singleton */
    public static ConnexionMySQL getInstance() {
        return uniqueInstance;
    }
  public static ConnexionMySQL getInstance(String chaineConnexion){
        return uniqueInstance = new ConnexionMySQL(chaineConnexion);
    }
    /*Cette fct retourne l'état de l'objet: connecté/déconnecté */
    public boolean isConnected() {
        return connected;
    }


    /*Cette fct retourne le résultat de la requête demandée par l'utilisateur. */
    public ResultSet selectQuery(String query) {
        ResultSet m_rs = null;
        if (connected) {
            try {
                m_rs = stat.executeQuery(query);
            } catch (SQLException e) {
                System.out.println(e.toString());
                System.out.println("Requete: " + query);
            }
        } else {
            System.out.println("Objet non connecte! Echec fct.");
        }
        return m_rs;
    }

    /*Cette fct permet d'exécuter une requête d'action. */
    public boolean actionQuery(String query) {
        boolean b = false;
        try {
            stat.executeUpdate(query);
            b = true;
            conn.commit();  // force à exécuter la requête sur la BDD
        } catch (SQLException e) {
            System.out.println(e.toString());
            System.out.println("Requete :" + query);
        }
        return b;
    }

   
    
  public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException classe) {
            System.out.println(classe.toString());
        }
            Connection connection = null;  
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/tfe_memoir","root","");
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
            return connection;  
        }  
   private ConnexionMySQL(String chaineConnexion){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException classe){
            JOptionPane.showMessageDialog(null, classe.toString());
            System.out.println(classe.toString());
        }
        connected=false;
        try{
            conn = DriverManager.getConnection(chaineConnexion);
            stat=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            //on peut parcourir le résultat dans les 2 sens, insensible aux chgmts d'autrui
            //on peut modifier ce résultat pour ensuite reporter ces modifs ds la table (updateRow)
            conn.setAutoCommit(false);
            connected=true;
	}
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,
                "ConnexionMySQL - ConnexionMySQL()\nErreur:\n"+e.getMessage(),
                "Erreur",JOptionPane.ERROR_MESSAGE);
        }
    }
}
