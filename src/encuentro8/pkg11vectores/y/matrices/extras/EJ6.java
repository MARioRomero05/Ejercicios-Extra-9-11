/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro8.pkg11vectores.y.matrices.extras;

import java.util.Scanner;

/** Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
    caracteres y, a medida que el usuario las va ingresando, construya una
    “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
    palabras se ubicarán todas en orden horizontal en una fila que será
    seleccionada de manera aleatoria. Una vez concluida la ubicación de las
    palabras, rellene los espacios no utilizados con un número aleatorio del 0
    al 9. Finalmente imprima por pantalla la sopa de letras creada.
    Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
    siguientes funciones de Java substring(), Length() y Math.random().
 *
 * @author Mario Romero
 */
public class EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            /*
            Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va
            ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se 
            ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. Una vez 
            concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio 
            del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
            */
            
        Scanner leer = new Scanner(System.in);
        //  String[] palabras = new String[5];
        String palabra ;
        int[] filaAleatoria  = new int[5];
        char[][] matriz = new char[20][20];
        boolean seRepite = false;
        for (int i = 0;i< 5; i++) {
            do {
                System.out.println("Ingrese la parabra n° " + (i + 1) + "(de 3 hasta 5 caracteres)");   
                palabra = leer.nextLine();
                    if (palabra.length () < 3 || palabra.length() > 5) {
                        System.out.println("La palabra tiene que tener entre 3 y 5 caracteres");
                    }
            } while (palabra.length() < 3 || palabra.length() > 5);
            do{
                if(i == 0){
                    filaAleatoria[i] = (int) (Math.random() * 21);
                    break;
                } else {
                    filaAleatoria[i] = (int) (Math.random() * 21);
                        for(int h = 1; h <=i; h++){
                            if(filaAleatoria[h] == filaAleatoria[h-1]){
                            seRepite = true;
                            }
                        }
                }
            } while(seRepite);
            //while(filaAleatoria[i] == filaAleatoria[i-1]);
            System.out.println(filaAleatoria[i]);
            for (int j = 0; j < 20; j++) {
                if (j < palabra.length()) {
                    matriz[filaAleatoria[i]][j] = palabra.charAt(j);
                }else {
                    matriz[filaAleatoria[i]][j] = Integer.toString((int) (Math.random() * 10)).charAt(0);
                }
            }
        }
        //Rellenar el resto de la matriz
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if( i != filaAleatoria[0] && i != filaAleatoria[1]&& i != filaAleatoria[2]&& i != filaAleatoria[3]&& i != filaAleatoria[4]){
                matriz[i][j] = Integer.toString((int) (Math.random() * 10)).charAt(0);
                }
            }
        }
        //Escribir matriz
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }
}
    
