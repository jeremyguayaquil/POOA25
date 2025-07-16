module com.veterinario.lemas {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.veterinario.lemas to javafx.fxml;
    exports com.veterinario.lemas;
}
