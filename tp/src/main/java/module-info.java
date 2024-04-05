module nat.fr {
    requires javafx.controls;
    requires javafx.fxml;

    opens nat.fr to javafx.fxml;
    exports nat.fr;
}
