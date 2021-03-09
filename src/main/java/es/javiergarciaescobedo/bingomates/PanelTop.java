package es.javiergarciaescobedo.bingomates;

import java.util.Random;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class PanelTop extends HBox {
    
    public PanelTop() {
        // Contenedor parte superior
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);
        this.setStyle("-fx-border-color: green");
        // Texto
        Label labelMsgSorteo = new Label("Número: ");
        this.getChildren().add(labelMsgSorteo);
        // Bola con número
        Bola bola = new Bola();
        this.getChildren().add(bola);
        // Botón para generar número
        Button buttonNumero = new Button("Extraer número");
        Random random = new Random();
        buttonNumero.setOnAction((ActionEvent e) -> {
            bola.setNumero(random.nextInt(90)+1);            
        });
        this.getChildren().add(buttonNumero);
    }
        
}
