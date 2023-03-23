/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro8.pkg11vectores.y.matrices.extras;

import java.util.Scanner;

/** Crear una función rellene un vector con números aleatorios, pasándole
    un arreglo por parámetro. Después haremos otra función o
    procedimiento que imprima el vector.    
 *
 * @author Mario Romero
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n=read.nextInt();
        int[] vector=new int[n];
        llenar(vector,n);
        imprimir(vector,n);
    }
    
    public static void llenar(int vector[],int n){
        System.out.println("Ingrese los numeros de los vectores");
        for (int i = 0; i < n; i++) {
            vector[i]=(int)(Math.random()*10);
        }
    }
    public static void imprimir(int vector[],int n){
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i]+" ");
        }
    }
    
}
