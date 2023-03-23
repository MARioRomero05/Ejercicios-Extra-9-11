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
public class EJ4GRUPO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double [][] matriz= new double[10][4];
        double nota1, nota2, nota3, nota4;
        int aprobados=0, desaprobados=0;
        
        for (int i = 0; i < 10; i++) {                  //crea matriz con numeros aleatorios
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = Math.random()*10.0;
            }
        }

        for (int i = 0; i < 10; i++) {              //imprime matriz
            for (int j = 0; j < 4; j++) {
                System.out.print(String.format("[%2.1f]",matriz[i][j]));
            }
            System.out.println("");
        }
    
        double [] promedio = new double[10];      // calculo e imprimo promedios
        
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            promedio[i] = matriz[i][0]*0.1 + matriz[i][1]*0.15 + matriz[i][2]*0.25 + matriz[i][3]*0.5;
            System.out.print(String.format("[%2.1f]",promedio[i]));
        }
        
        System.out.println("\n");
   
        for (int i = 0; i < 10; i++) 
            if(promedio[i]>=7) aprobados++;
        else    desaprobados++;
        
        System.out.println("Aprobaron " + aprobados + " alumnos."); 
        System.out.println("Desaprobaron " + desaprobados + " alumnos");
        
  }
}
    

