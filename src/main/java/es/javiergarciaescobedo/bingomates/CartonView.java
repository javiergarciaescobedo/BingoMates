package es.javiergarciaescobedo.bingomates;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class CartonView extends GridPane {
    
    Carton carton;
    final int TAM_X = 40;
    final int TAM_Y = 40;
    
    public CartonView(Carton carton) {  
        this.carton = carton;
        this.setStyle("-fx-grid-lines-visible: true");
        for(int y=0; y<carton.numFilas; y++) {
            for(int x=0; x<9; x++) {
                int num = carton.getNumPos(x, y); 
                if(num != 0) {
                    String strNum = String.valueOf(num);
                    Label label = new Label(strNum);
                    label.setPrefWidth(TAM_X);
                    label.setPrefHeight(TAM_Y);
                    label.setAlignment(Pos.CENTER);
                    this.add(label, x, y);
                } else {
                    Rectangle r = new Rectangle();
                    r.setWidth(TAM_X);
                    r.setHeight(TAM_Y);
                    r.setFill(Color.LIGHTGRAY);
                    this.add(r, x, y);
                }
            }
        }
        this.setMaxWidth(TAM_X*9);
        this.setMaxHeight(TAM_Y*carton.numFilas);
        this.mouseController();
    }
    
    private void mouseController() {
        this.setOnMouseClicked((MouseEvent mouseEvent) -> {
            System.out.println("\nDetectado clic en X: " + mouseEvent.getX() + ", Y: "+ mouseEvent.getY() );
            int colClic = (int)(mouseEvent.getX() / TAM_X);
            int filClic = (int)(mouseEvent.getY() / TAM_Y);
            System.out.print("Col: " + colClic + ", Fil: " + filClic);
            int num = carton.getNumPos(colClic, filClic);
            System.out.println(" >>> Número: " + num);
        });
    }
}
