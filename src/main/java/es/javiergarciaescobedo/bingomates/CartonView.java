package es.javiergarciaescobedo.bingomates;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class CartonView extends GridPane {
    
    public CartonView(Carton carton) {  
        for(int y=0; y<carton.numFilas; y++) {
            for(int x=0; x<9; x++) {
                int num = carton.getNumPos(x, y); 
                String strNum = String.valueOf(num);
                Label label = new Label(strNum);
                this.add(label, x, y);
            }
        }
    }
}
