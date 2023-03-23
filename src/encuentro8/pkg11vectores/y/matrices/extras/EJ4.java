/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro8.pkg11vectores.y.matrices.extras;

/**
 *
 * @author Mario Romero
 */
public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aprobado=0,desaprobado=0;
        int [][]matriz= new int[10][4];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        double [] vector= new double[10];
            for (int i = 0; i < 10; i++) {
            vector[i]=matriz[i][0]*0.1 + matriz[i][1]*0.15 + matriz[i][2]*0.25 + matriz[i][3]*0.5;
            System.out.print(String.format("[%2.1f]",vector[i]));
            }   
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            if (vector[i]>=7) {
                aprobado++;
            } else {
                desaprobado++;
            }
        }
        System.out.println("Alumnos aprobados: "+aprobado);
        System.out.println("Alumnos desaprobados: "+desaprobado);
    }
}
        
    

