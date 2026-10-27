package autopartes.vista;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Se encarga de cambiar de pantalla, para no repetir ese código en cada controlador.
 *
 * Para cambiar solo el contenido del centro de la ventana principal se usa
 * PrincipalController.mostrar().
 *
 * @author Jahdiel Torres
 */
public class Navegador {

    // Nombres de los archivos FXML (están en src/main/resources/autopartes/vista/)
    public static final String LOGIN = "Login.fxml";
    public static final String PRINCIPAL = "Principal.fxml";

    private static Stage ventana;

    /**
     * Guarda la ventana de la aplicación para poder cambiar su contenido después.
     */
    public static void iniciar(Stage ventanaPrincipal) {
        ventana = ventanaPrincipal;
    }

    /**
     * Reemplaza toda la pantalla por la vista indicada.
     *
     * @param vista nombre del archivo FXML, por ejemplo Navegador.PRINCIPAL
     */
    public static void irA(String vista) {
        Parent raiz = cargar(vista);
        if (ventana.getScene() == null) {
            // La primera vez se crea la escena y se le aplican los estilos
            Scene escena = new Scene(raiz, 1280, 760);
            escena.getStylesheets().add(Navegador.class.getResource("estilos.css").toExternalForm());
            ventana.setScene(escena);
        } else {
            // Las siguientes veces solo se cambia el contenido
            ventana.getScene().setRoot(raiz);
        }
    }

    /**
     * Lee un archivo FXML y devuelve la pantalla que describe.
     *
     * @param vista nombre del archivo FXML
     * @return el componente principal (raíz) de esa pantalla
     */
    public static Parent cargar(String vista) {
        try {
            return FXMLLoader.load(Navegador.class.getResource(vista));
        } catch (IOException e) {
            throw new RuntimeException("No se pudo cargar la vista " + vista, e);
        }
    }

    /**
     * Indica si ya existe el archivo FXML de una vista.
     */
    public static boolean existe(String vista) {
        return Navegador.class.getResource(vista) != null;
    }
}
