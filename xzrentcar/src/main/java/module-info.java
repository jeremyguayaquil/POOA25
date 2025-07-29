module com.rentas.xzrentcar {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens com.rentas.xzrentcar to javafx.fxml;

    exports com.rentas.xzrentcar;
}
