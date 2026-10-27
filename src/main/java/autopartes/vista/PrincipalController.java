package autopartes.vista;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * Controlador de la ventana principal (Principal.fxml): menú lateral y contenido.
 *
 * Cada módulo agrega su pantalla creando el archivo FXML con el nombre de abajo
 * (Catalogo.fxml, Comparador.fxml, Socios.fxml, MiCuenta.fxml). Mientras no exista,
 * se muestra "Sección en construcción".
 *
 * @author Jahdiel Torres
 */
public class PrincipalController {

    public static final String INICIO = "Inicio.fxml";
    public static final String CATALOGO = "Catalogo.fxml";
    public static final String COMPARADOR = "Comparador.fxml";
    public static final String SOCIOS = "Socios.fxml";
    public static final String MI_CUENTA = "MiCuenta.fxml";

    @FXML
    private StackPane contenido;
    @FXML
    private Button btnInicio;
    @FXML
    private Button btnCatalogo;
    @FXML
    private Button btnComparador;
    @FXML
    private Button btnSocios;
    @FXML
    private Button btnMiCuenta;

    // Botón del menú que está seleccionado
    private Button botonActivo;

    /**
     * JavaFX llama este método automáticamente al cargar la pantalla.
     */
    @FXML
    private void initialize() {
        irInicio();
    }

    @FXML
    private void irInicio() {
        mostrar(INICIO, btnInicio);
    }

    @FXML
    private void irCatalogo() {
        mostrar(CATALOGO, btnCatalogo);
    }

    @FXML
    private void irComparador() {
        mostrar(COMPARADOR, btnComparador);
    }

    @FXML
    private void irSocios() {
        mostrar(SOCIOS, btnSocios);
    }

    @FXML
    private void irMiCuenta() {
        mostrar(MI_CUENTA, btnMiCuenta);
    }

    @FXML
    private void cerrarSesion() {
        Navegador.irA(Navegador.LOGIN);
    }

    /**
     * Muestra una vista en el centro de la ventana y resalta su botón del menú.
     */
    private void mostrar(String vista, Button boton) {
        if (botonActivo != null) {
            botonActivo.getStyleClass().remove("menu-activo");
        }
        boton.getStyleClass().add("menu-activo");
        botonActivo = boton;

        if (Navegador.existe(vista)) {
            contenido.getChildren().setAll(Navegador.cargar(vista));
        } else {
            contenido.getChildren().setAll(enConstruccion(vista));
        }
    }

    /**
     * Crea el aviso que se muestra cuando una pantalla todavía no existe.
     */
    private VBox enConstruccion(String vista) {
        Label titulo = new Label("Sección en construcción");
        titulo.getStyleClass().add("titulo-seccion");
        Label detalle = new Label("Esta pantalla aparecerá cuando se agregue " + vista + ".");
        detalle.getStyleClass().add("texto-secundario");
        VBox caja = new VBox(8, titulo, detalle);
        caja.setAlignment(Pos.CENTER);
        return caja;
    }
}
