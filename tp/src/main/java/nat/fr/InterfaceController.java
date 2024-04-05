package nat.fr;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class InterfaceController {
    @FXML
    private TableView<Livre> tableView;
    @FXML
    private TableColumn<Livre, String> titreCol;
    @FXML
    private TableColumn<Livre, String> auteurCol;
    @FXML
    private TableColumn<Livre, String> anneeCol;
    @FXML
    private TableColumn<Livre, String> genreCol;
    @FXML
    private TextField titreField;
    @FXML
    private TextField auteurField;
    @FXML
    private TextField anneeField;
    @FXML
    private TextField genreField;

    // Méthode appelée lors du clic sur le bouton Supprimer
    @FXML
    private void deleteLivre() {
        Livre livre = tableView.getSelectionModel().getSelectedItem();
        if (livre != null) {
            tableView.getItems().remove(livre);
            // Supprimer le livre de la base de données ici
        }
    }

    // Méthode appelée lors du clic sur le bouton Ajouter
    @FXML
    private void addLivre() {
        String titre = titreField.getText();
        String auteur = auteurField.getText();
        String annee = anneeField.getText();
        String genre = genreField.getText();
        
        // Ajouter le livre à la base de données et à la TableView ici
        tableView.getItems().add(new Livre(titre, auteur, annee, genre));
    }
}
