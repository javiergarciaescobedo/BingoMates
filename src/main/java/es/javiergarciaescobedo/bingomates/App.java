package es.javiergarciaescobedo.bingomates;

import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
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

        // Contenedor parte superior
        HBox hboxTop = new HBox();
        hboxTop.setAlignment(Pos.CENTER);
        hboxTop.setSpacing(10);
        hboxTop.setStyle("-fx-border-color: green");
        paneRoot.setTop(hboxTop);        
        // Texto
        Label labelMsgSorteo = new Label("Número: ");
        hboxTop.getChildren().add(labelMsgSorteo);
        // Bola con número
        Bola bola = new Bola();
        hboxTop.getChildren().add(bola);
        // Botón para generar número
        Button buttonNumero = new Button("Extraer número");
        Random random = new Random();
        buttonNumero.setOnAction((ActionEvent e) -> {
            bola.setNumero(random.nextInt(90)+1);            
        });
        hboxTop.getChildren().add(buttonNumero);
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