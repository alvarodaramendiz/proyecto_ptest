package autopartes.vista;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Controlador de la pantalla de inicio (Inicio.fxml).
 *
 * PENDIENTE: los contadores se llenarán con los servicios de catálogo y socios,
 * y la búsqueda llevará al comparador.
 *
 * @author Jahdiel Torres
 */
public class InicioController {

    @FXML
    private TextField txtBuscar;
    @FXML
    private Label lblRepuestos;
    @FXML
    private Label lblLocales;
    @FXML
    private Label lblTalleres;
    @FXML
    private Label lblMensaje;

    @FXML
    private void initialize() {
        lblRepuestos.setText("0");
        lblLocales.setText("0");
        lblTalleres.setText("0");
    }

    @FXML
    private void buscar() {
        if (txtBuscar.getText().isBlank()) {
            lblMensaje.setText("Escribe el nombre o la referencia de un repuesto.");
            return;
        }
        lblMensaje.setText("La búsqueda estará disponible con el comparador.");
    }
}
