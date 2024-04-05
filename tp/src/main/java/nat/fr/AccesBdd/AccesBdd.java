package nat.fr.AccesBdd;

import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesBdd {

    private static String nom = "gsb_etudiants";
    private static String serveur = "localhost";
    private static int port = 3306;
    private static String urlConnexion = "jdbc:mysql://" + serveur + ":" + port + "/" + nom;
    private static String nomUtilisateur = "root";
    private static String mdpUtilisateur = "azerty";

    /**
     * Retourne une connexion à la base de données.
     *
     * @return une connexion à la base de données
     */
    public static Connection getConnection() {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(urlConnexion, nomUtilisateur, mdpUtilisateur);
            if (conn != null) {
                Logger.log("Connexion OK");
            }
        } catch (SQLException ex) {
            Logger.log("Connexion BDD : échec");
            Logger.log(ex.getMessage());
            return null;
        }
        return conn;
    }
}
