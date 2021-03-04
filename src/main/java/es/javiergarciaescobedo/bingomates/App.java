package es.javiergarciaescobedo.bingomates;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane paneRoot = new BorderPane();
        var scene = new Scene(paneRoot, 640, 480);
        stage.setScene(scene);
        stage.show();
        
        Carton carton = new Carton(5);
        carton.mostrarPorConsola();
        
        CartonView cartonView = new CartonView(carton);
        paneRoot.setCenter(cartonView);
    }
    
    public void mostrarNum(int num) {
        if(num != -1) {
            System.out.println(num);
        } else {
            System.out.println("La posición es incorrecta");
        }
    }

    public static void main(String[] args) {
        launch();
    }

}