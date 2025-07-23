module com.veterinario.lemas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.veterinario.lemas to javafx.fxml, java.sql;

    exports com.veterinario.lemas;
}
