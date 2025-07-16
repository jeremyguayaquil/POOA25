package com.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RestaController {

    @FXML
    private Button btnRestar;

    @FXML
    private TextField txtNumero1;

    @FXML
    private TextField txtNumero2;

    @FXML
    void restar(ActionEvent event) {
        int numero1 = Integer.parseInt(txtNumero1.getText());
        int numero2 = Integer.parseInt(txtNumero2.getText());
        int resultado = numero1 - numero2;

        // Mostrar el resultado en la consola
        System.out.println("El resultado de la resta es: " + resultado);
        // También podrías mostrarlo en un Alert
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Resultado de la Resta");
        alert.setHeaderText(null);
        alert.setContentText("El resultado de la resta es: " + resultado);
        alert.showAndWait();
    }

}
