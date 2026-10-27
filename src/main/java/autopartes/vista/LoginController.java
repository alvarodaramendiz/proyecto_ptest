package autopartes.vista;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * Controlador de la pantalla de inicio de sesión (Login.fxml).
 *
 * PENDIENTE (rama feature/user-management): validar el usuario con UsuarioServicio.
 * Por ahora solo revisa que los campos no estén vacíos.
 *
 * @author Jahdiel Torres
 */
public class LoginController {

    // Conectados con los componentes del FXML que tienen el mismo fx:id
    @FXML
    private TextField txtCorreo;
    @FXML
    private PasswordField txtContrasena;
    @FXML
    private Label lblMensaje;

    @FXML
    private void ingresar() {
        if (txtCorreo.getText().isBlank() || txtContrasena.getText().isBlank()) {
            lblMensaje.setText("Ingresa tu correo y tu contraseña.");
            return;
        }
        Navegador.irA(Navegador.PRINCIPAL);
    }

    @FXML
    private void crearCuenta() {
        lblMensaje.setText("El registro de usuarios aún está en construcción.");
    }
}
