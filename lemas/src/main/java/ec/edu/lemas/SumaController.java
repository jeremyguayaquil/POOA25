package ec.edu.lemas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SumaController {

    @FXML
    private Button btnSumar;

    @FXML
    private TextField txtNumero1;

    @FXML
    private TextField txtNumero2;

    @FXML
    void sumar(ActionEvent event) {
        int numero1 = Integer.parseInt(txtNumero1.getText());
        int numero2 = Integer.parseInt(txtNumero2.getText());
        int resultado = numero1 + numero2;

        // Aquí podrías usar un Alert para mostrar el resultado en una ventana emergente
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Resultado");
        alert.setHeaderText("Suma de Números");
        alert.setContentText("El resultado de la suma es: " + resultado);
        alert.showAndWait();
    }

}
