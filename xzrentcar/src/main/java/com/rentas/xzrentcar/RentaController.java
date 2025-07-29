package com.rentas.xzrentcar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class RentaController {

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private CheckBox cbxTienetc;

    @FXML
    private ComboBox<ModeloVehiculoEntity> cmbModelo;

    @FXML
    private DatePicker dpFeNacimiento;

    @FXML
    private TableView<RentaEntity> tblRenta;

    @FXML
    private TableColumn<RentaEntity, String> tcDni;

    @FXML
    private TableColumn<RentaEntity, Date> tcFeNacimiento;

    @FXML
    private TableColumn<RentaEntity, String> tcMarca;

    @FXML
    private TableColumn<RentaEntity, String> tcModelo;

    @FXML
    private TableColumn<RentaEntity, String> tcNombre;

    @FXML
    private TableColumn<RentaEntity, String> tcTiene;

    @FXML
    private TextField txtDNI;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtNombre;

    // Lista observable para almacenar los registros
    private ObservableList<RentaEntity> lstRenta = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        llenarComboModelo();

        // Configurar las columnas de la tabla
        tcDni.setCellValueFactory(new PropertyValueFactory<RentaEntity, String>("dni"));
        tcFeNacimiento.setCellValueFactory(new PropertyValueFactory<RentaEntity, Date>("feNacimiento"));
        tcMarca.setCellValueFactory(new PropertyValueFactory<RentaEntity, String>("marca"));
        tcModelo.setCellValueFactory(new PropertyValueFactory<RentaEntity, String>("modelo"));
        tcNombre.setCellValueFactory(new PropertyValueFactory<RentaEntity, String>("nombres"));
        tcTiene.setCellValueFactory(new PropertyValueFactory<RentaEntity, String>("tieneTc"));

        // Vincular la lista observable a la tabla
        tblRenta.setItems(lstRenta);

    }

    private void llenarComboModelo() {
        List<ModeloVehiculoEntity> lstModelo = new ArrayList<ModeloVehiculoEntity>();
        ModeloVehiculoEntity objModeloVehiculo = new ModeloVehiculoEntity();
        objModeloVehiculo.setModelo("Moto");
        lstModelo.add(objModeloVehiculo);

        objModeloVehiculo = new ModeloVehiculoEntity();
        objModeloVehiculo.setModelo("SUV");
        lstModelo.add(objModeloVehiculo);

        objModeloVehiculo = new ModeloVehiculoEntity();
        objModeloVehiculo.setModelo("Sedan");
        lstModelo.add(objModeloVehiculo);

        objModeloVehiculo = new ModeloVehiculoEntity();
        objModeloVehiculo.setModelo("Camioneta");
        lstModelo.add(objModeloVehiculo);

        cmbModelo.getItems().addAll(lstModelo);
        cmbModelo.getSelectionModel().selectFirst();
    }

    @FXML
    void guardar(ActionEvent event) {
        // Validar campos obligatorios
        boolean esValido = validarCampos();
        if (!esValido) {
            return;
        }

        String dni = txtDNI.getText();
        String nombres = txtNombre.getText();
        String marca = txtMarca.getText();
        String modelo = cmbModelo.getSelectionModel().getSelectedItem().getModelo();
        Date feNacimiento = null;
        if (dpFeNacimiento.getValue() != null) {
            feNacimiento = java.util.Date
                    .from(dpFeNacimiento.getValue().atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
        }
        String tieneTc = cbxTienetc.isSelected() ? "Si" : "No";

        // Crear una nueva entidad de renta
        RentaEntity renta = new RentaEntity();
        renta.setDni(dni);
        renta.setNombres(nombres);
        renta.setMarca(marca);
        renta.setModelo(modelo);
        renta.setFeNacimiento(feNacimiento);
        renta.setTieneTc(tieneTc);

        // Agregar la entidad a la lista y actualizar la tabla
        lstRenta.add(renta);
    }

    private boolean validarCampos() {
        if (!cbxTienetc.isSelected()) {
            return false;
        }
        return true;
    }

    @FXML
    void limpiar(ActionEvent event) {

    }

}
