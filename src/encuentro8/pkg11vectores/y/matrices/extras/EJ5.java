/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro8.pkg11vectores.y.matrices.extras;

import java.util.Scanner;

/**
 *
 * @author Mario Romero
 */
public class EJ5 {

    /** Realizar un programa que llene una matriz de tamaño NxM con valores
        aleatorios y muestre la suma de sus elementos.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int suma=0;
        System.out.println("Ingrese la cantidad de filas de su matriz");
        int f = read.nextInt();
        System.out.println("Ingrese la cantidad de columnas de su matriz");
        int c = read.nextInt();
        int[][]matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j]+" ");        
            }
            System.out.println("");
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                suma+=matriz[i][j];
            }
        }
        System.out.println("La suma de los valores de su matriz es de: "+suma);
    }    
}
