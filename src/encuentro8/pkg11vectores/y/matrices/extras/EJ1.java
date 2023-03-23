/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro8.pkg11vectores.y.matrices.extras;

import java.util.Scanner;

/** Realizar un algoritmo que calcule la suma de todos los elementos de un
    vector de tamaño N, con los valores ingresados por el usuario.
 *
 * @author Mario Romero
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = read.nextInt();
        int su=0;
        int[] vector= new int[n];
        System.out.println("Ingrese los numeros del vector");
        for (int i = 0; i < n; i++) {
            vector[i]=read.nextInt();
            su+=vector[i];
        }
        System.out.println("La suma de su vector es: "+su);
    }
    
}
