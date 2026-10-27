package autopartes;

import autopartes.vista.Navegador;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Clase principal: arranca la aplicación ORIGEN - Portal de Repuestos.
 *
 * Más adelante, aquí se crearán los servicios pasándoles su DAO, por ejemplo:
 * new ComparadorServicio(new OfertaDAOArchivo()).
 *
 * @author Jahdiel Torres
 */
public class Main extends Application {

    @Override
    public void start(Stage ventana) {
        Navegador.iniciar(ventana);
        Navegador.irA(Navegador.LOGIN);
        ventana.setTitle("ORIGEN | Portal de Repuestos");
        ventana.setMinWidth(1000);
        ventana.setMinHeight(640);
        ventana.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
