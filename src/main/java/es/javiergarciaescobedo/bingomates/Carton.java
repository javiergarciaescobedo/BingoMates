package es.javiergarciaescobedo.bingomates;

import java.util.Random;

public class Carton {
    
    int[][] nums;
            
    public void generar() {
        nums = new int[9][3];
        
        for(int y=0; y<3; y++) {
            for(int x=0; x<9; x++) {
                nums[x][y] = getNumAleatorio(1, 90);
            }
        }
        
        this.mostrarPorConsola();
    }
    
    public void mostrarPorConsola() {
        for(int y=0; y<3; y++) {
            for(int x=0; x<9; x++) {
                //System.out.println("x=" + x + " y=" + y);
                System.out.print(nums[x][y] + " ");
            }
            System.out.println();
        }        
    }
    
    public int getNumAleatorio(int min, int max) {
        Random random = new Random();
        int num = random.nextInt(max-min+1) + min;
        return num;
    }
    
}
