module ec.edu.lemas {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.lemas to javafx.fxml;
    exports ec.edu.lemas;
}
