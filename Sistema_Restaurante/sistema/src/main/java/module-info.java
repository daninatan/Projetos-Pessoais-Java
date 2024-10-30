module restaurante {
    requires javafx.controls;
    requires javafx.fxml;

    opens restaurante to javafx.fxml;
    exports restaurante;
}
