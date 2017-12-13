package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        System.out.println (" cuantas filas quieres en esa matriz ");
        int fila = Integer.parseInt (br.readLine ());

        System.out.println (" Dame ahora el numero de columnas ");
        int columnas = Integer.parseInt (br.readLine ());

        int[][] matriz = new int[fila][columnas];


        for (int i= 0; i<matriz.length;i++){
            for (int j=0; j<matriz[0].length;j++){
                System.out.print ( " Introdusca valores a la matriz : ");
                matriz[i][j]= Integer.parseInt (br.readLine ());
            }
        }

          //  mostrar las matrices

        System.out.println (" Matriz de orden : "+fila+"x"+columnas);
        for (int i= 0; i<matriz.length; i++){

            for (int j=0; j<matriz[0].length;j++){

                System.out.print(matriz[i][j]);
            }
            System.out.println (" ");
        }


    }
}
