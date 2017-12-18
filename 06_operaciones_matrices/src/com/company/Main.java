package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        Random r = new Random ();

        System.out.println (" Primera Matriz ");

        int[][] matriz = new int[4][4];

        for (int i= 0; i<matriz.length;i++){

            for (int j=0; j<matriz[i].length;j++){
                System.out.println ("Columna "+(i+1)+" Fila "+(j+1));
                matriz[i][j] = r.nextInt (100);
            }
        }

        int[][] matriz2 = new int[4][4];

         for (int i=0; i<matriz2.length;i++){
             for (int j=0; j<matriz2[i].length;j++){
                 System.out.println ("Columna "+(i+1)+" Fila "+(j+1));
                 matriz2[i][j] = r.nextInt (100);
             }
         }



        char opcion;
        do {
            System.out.println("OPERACIONES DISPONIBLES");
            System.out.println("-----------------------");
            System.out.println("a) Suma");
            System.out.println("b) Producto por un escalar");
            System.out.println("c) Producto");
            System.out.println("d) Traspuesta");
            System.out.println("e) Salir");
            System.out.print("Opción: ");

            opcion = br.readLine().charAt(0);

            switch (opcion) {
                case 'a':

                    break;
                case 'b':
                    System.out.print("Escribe un número: ");
                    int n = Integer.parseInt(br.readLine());


                    break;
                case 'c':

                    break;
                case 'd':

                    break;
                case 'e':
                    break;
                default:
                    System.out.println("ERROR: Elige una opción válida...");
            }
        } while (opcion != 'e');

    }

    public static int[][] sumarMatrices(int[][] m1, int[][] m2){
         int i=0,j = 0;
        int suma[][] = new int[4][4];
       for ( i=0; i<suma.length;i++){
           for ( j=0; j<suma[i].length;j++){

               suma[i][j] = m1[i][j]+m2[i][j];
           }
       }
       return suma;
    }

    public static int[][] productoMatrices(int[][] m1, int[][] m2){
        int i=0,j = 0;
        int[][] producto = new int[4][4];
        for ( i=0; i<producto.length;i++){
            for ( j=0; j<producto[i].length;j++){

              //  producto = m1[i][j]*m2[i][j];

            }

        }
        return producto;
    }


    private static void visualizar(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.format("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println();
    }
}
