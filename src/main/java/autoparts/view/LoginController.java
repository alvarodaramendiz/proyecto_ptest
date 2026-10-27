package autoparts.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * Controlador de la pantalla de inicio de sesión (Login.fxml).
 *
 * PENDIENTE (rama feature/user-management): validar el usuario con UserService.
 * Por ahora solo revisa que los campos no estén vacíos.
 *
 * @author Jahdiel Torres
 */
public class LoginController {

    @FXML
    private TextField txtEmail;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Label lblMessage;

    @FXML
    private void login() {
        if (txtEmail.getText().isBlank() || txtPassword.getText().isBlank()) {
            lblMessage.setText("Ingresa tu correo y tu contraseña.");
            return;
        }
        Navigator.goTo(Navigator.DASHBOARD);
    }

    @FXML
    private void createAccount() {
        lblMessage.setText("El registro de usuarios aún está en construcción.");
    }
}
