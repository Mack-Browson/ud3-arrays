package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

         // Recibir datos desde el teclado

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        // numeros aleatorios

        Random r = new Random ();

        int aleatorio = r.nextInt(100);

        System.out.println (" cuantas filas quieres en esa matriz ");
        int fila = Integer.parseInt (br.readLine ());

        System.out.println (" Dame ahora el numero de columnas ");
        int columnas = Integer.parseInt (br.readLine ());

        int[][] matriz = new int[fila][columnas];


        for (int i= 0; i<matriz.length;i++){
            for (int j=0; j<matriz[i].length;j++){
               // System.out.print ( " valores aleatorios para la matriz : ");
                matriz[i][j]= Integer.parseInt (String.valueOf (aleatorio));
            }
        }

        //  mostrar las matrices


        for (int i= 0; i<matriz.length; i++){

            for (int j=0; j<matriz[i].length;j++){

                System.out.print(matriz[i][j]);
            }
            System.out.println (" ");
        }

        // No se porque me imprime la columna el doble
    }
}
