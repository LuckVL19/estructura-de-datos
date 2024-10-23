/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;
import java.util.Scanner;

/**
 *
 * @author eliel
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f1,c1,f2,c2,f3,c3;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar la cantidad de filas de la primera matriz");
        f1 = leer.nextInt();
        System.out.println("Ingresar la cantidad de columnas de la primera matriz");
        c1 = leer.nextInt();
        System.out.println("ingresar la cantidad de filas de la segunda matriz");
        f2 = leer.nextInt();
        System.out.println("Ingresar la cantidad de columnas de la la segunda matriz");
        c2 = leer.nextInt();
        System.out.println("ingresar la cantidad de filas de la tercera matriz");
        f3 = leer.nextInt();
        System.out.println("Ingresar la cantidad de columnas de la la tercera matriz");
        c3 = leer.nextInt();
        
        int matriz1[][] = new int[f1][c1];
        int matriz2[][] = new int[f2][c2];
        int matriz3[][] = new int[f3][c3];
        
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1.length; j++){
                System.out.println("ingrese el primer valor " + i +" "+ j +" ");
                matriz1[i][j]= leer.nextInt();
            }
        }
        
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2.length; j++){
                System.out.println("ingrese el valor para " + i +" "+ j +" ");
                matriz2[i][j]= leer.nextInt();
            }
        }
        
        for(int i = 0; i < matriz3.length; i++){
            for(int j = 0; j < matriz3.length; j++){
                System.out.println("ingrese el primer valor " + i +" "+ j +" ");
                matriz3[i][j]= leer.nextInt();
            }
        }
        
        if (matriz1[0].length == matriz2.length) {
            int matriz12[][] = new int [matriz1.length] [matriz2[0].length];
            for (int i = 0; i < matriz12.length; i++) {
                    for (int j = 0; j < matriz12[0].length; j++) {
                        matriz12[i][j] = 0;
                        for (int r = 0; r < matriz12[0].length; r++) {
                            matriz12[i][j] += matriz1[i][r] * matriz2[r][j];
                        }
                    }

                    if (matriz12.length == matriz3.length && matriz12[0].length == matriz3[0].length) {
                        int matrizFinal[][] = new int [f1][c1];
                        for(int i = 0; i < matrizFinal .length; i++){
                            for(int j = 0; j < matrizFinal[0].length; j++)
                                matrizFinal[i][j] = matriz12[i][j] + matriz3[i][j];
                        }
                    }
           
            }
            
        }
    }
    
    
}


