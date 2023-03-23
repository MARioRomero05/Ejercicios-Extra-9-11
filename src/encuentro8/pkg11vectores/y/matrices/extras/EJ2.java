/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro8.pkg11vectores.y.matrices.extras;

import java.util.Scanner;

/** Escriba un programa que averigüe si dos vectores de N enteros son
    iguales (la comparación deberá detenerse en cuanto se detecte alguna
    diferencia entre los elementos).
 *
 * @author Mario Romero
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int n = read.nextInt();
        boolean comp=false;
        int [] vector1= new int[n];
        int [] vector2= new int[n];
        System.out.println("Ingrese los numeros de los vectores");
        for (int i = 0; i < n; i++) {
            vector1[i]=read.nextInt();
        }
        for (int i = 0; i < n; i++) {
            vector2[i]=read.nextInt();
        }           
            for (int i = 0; i < n; i++) {
            if (vector1[i]==vector2[i]){
                comp=true;
            } else {
                comp=false;
                break;
            }
        }  
        System.out.println("los vectores son iguales? "+comp);
    }
    
}
