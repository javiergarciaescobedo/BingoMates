package es.javiergarciaescobedo.bingomates;

import java.util.Random;

public class Carton {
    
    int[][] nums;
    int numFilas;   
    
    public Carton(int numFilas) {
        this.numFilas = numFilas;
        nums = new int[9][numFilas];
        
        int num;
        int col;
        for(int fil=0; fil<numFilas; fil++) {
            for(int i=0; i<5; i++) { // Cantidad de números a colocar en la línea
                do {
                    num = getNumAleatorio(1, 89);
                    col = this.getNumColumna(num);
                // Controlar que no se coloque en una posición ocupada para
                //   asegurar que se cumpla la cantidad de números en la fila
                //   y que no se repita el número
                } while(nums[col][fil] != 0 || existeNumero(num));
                nums[col][fil] = num;
            }
        }
    }
    
    // Retorna el número de la columna
    private int getNumColumna(int num) {
        return (num / 10);
    } 
    
    public void mostrarPorConsola() {
        for(int y=0; y<numFilas; y++) {
            for(int x=0; x<9; x++) {
                System.out.print(nums[x][y] + " ");
            }
            System.out.println();
        }        
    }
    
    private int getNumAleatorio(int min, int max) {
        Random random = new Random();
        int num = random.nextInt(max-min+1) + min;
        return num;
    }
    
    public int getNumPos(int posx, int posy) {
        try {            
            return nums[posx][posy];
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return -1;
        }
    }
    
    /**
     * Comprueba si un determinado número se encuentra en el cartón
     * @param num Número sobre el que se desea comprobar si existe en el cartón
     * @return true si existe el número en el cartón y false en caso contrario
     */
    public boolean existeNumero(int num) {
        int columna = this.getNumColumna(num);
        for(int y=0; y<this.numFilas; y++) {
            if(this.nums[columna][y] == num) {
                return true;
            }
        }
        return false;
    }
    
}
