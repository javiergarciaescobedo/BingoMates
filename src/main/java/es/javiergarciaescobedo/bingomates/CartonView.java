package es.javiergarciaescobedo.bingomates;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class CartonView extends GridPane {
    
    public CartonView(Carton carton) {  
        this.setStyle("-fx-grid-lines-visible: true");
        for(int y=0; y<carton.numFilas; y++) {
            for(int x=0; x<9; x++) {
                int num = carton.getNumPos(x, y); 
                if(num != 0) {
                    String strNum = String.valueOf(num);
                    Label label = new Label(strNum);
                    label.setPrefWidth(30);
                    label.setPrefHeight(30);
                    label.setAlignment(Pos.CENTER);
                    this.add(label, x, y);
                } else {
                    Rectangle r = new Rectangle();
                    r.setWidth(30);
                    r.setHeight(30);
                    r.setFill(Color.LIGHTGRAY);
                    this.add(r, x, y);
                }
            }
        }
        this.setMaxWidth(30*9);
        this.setMaxHeight(30*carton.numFilas);
    }
}
