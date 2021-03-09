package es.javiergarciaescobedo.bingomates;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Bola extends StackPane {
    
    Label labelBola;
            
    public Bola() {
        Circle circleBola = new Circle();
        circleBola.setRadius(20);
        circleBola.setFill(Color.LIGHTGRAY);
        this.getChildren().add(circleBola);
        
        labelBola = new Label();
        labelBola.setStyle("-fx-border-color: red");
        this.getChildren().add(labelBola);
    }
    
    public void setNumero(int num) {
        labelBola.setText(String.valueOf(num));
    }    
    
}
