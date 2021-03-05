package es.javiergarciaescobedo.bingomates;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Bola extends Group {
    
    public Bola() {
        Circle circleBola = new Circle();
        circleBola.setRadius(20);
        circleBola.setFill(Color.LIGHTGRAY);
        this.getChildren().add(circleBola);
        
        Label labelBola = new Label();
        labelBola.setText("23");
        this.getChildren().add(labelBola);
    }
    
    
}
