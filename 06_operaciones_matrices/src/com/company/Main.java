package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    private static int[][] sumaMatriz(int[][] m1, int[][] m2){
        int[][] suma = new int[4][4];
        for (int i=0; i<suma.length;i++){
            for (int j=0;j<suma.length;){
                suma[i][j]=m1[i][j]+m2[i][j];
            }
        }
        return suma;
    }

    private static int[][] productoMatriz(int[][] m1, int[][] m2){
        int[][] producto = new int[4][4];
        for (int i=0; i<producto.length;i++){
            for (int j=0;j<producto.length;){
                producto[i][j]=m1[i][j]*m2[i][j];
            }
        }
        return producto;
    }

    private static int[][] prodEscalarMatriz(int[][] m1, int n){
        int[][] prodEscalar = new int[4][4];
        for (int i=0; i<prodEscalar.length;i++){
            for (int j=0;j<prodEscalar.length;){
                prodEscalar[i][j]=n*m1[i][j];
            }
        }
        return prodEscalar;
    }

    private static int[][] traspuestaMatriz(int[][] m1){
        int[][] traspuesta = new int[4][4];
        for (int i=0; i<traspuesta.length;i++){
            for (int j=0;j<traspuesta.length;){
                traspuesta[i][j]=m1[j][i];
            }
        }
        return traspuesta;
    }

    private static void visualizar(int[][] matriz){


        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int[][] matriz1=new int[4][4];
        int[][] matriz2=new int[4][4];
        Random r=new Random();
           int aleatorio=r.nextInt(100);
        //matriz1
        for (int i=0;i<matriz1.length;i++){
            for (int j=0;j<matriz1.length;j++){
                matriz1[i][j]=aleatorio;
            }
        }

        //matriz2
        for (int i=0;i<matriz2.length;i++){
            for (int j=0;j<matriz2.length;j++){
                matriz2[i][j]=aleatorio;
            }
        }

        //Operaciones con matrices
       String opcion;
        do {

            System.out.println("a) suma de matrices : "+" \n b) producto escalar "
                    +"\n c) producto matrices "+"\n d) Matriz traspuesta"+"e) salir");

            System.out.println("Elige la operacion : ");
            opcion =br.readLine();

            switch (opcion){
                case "a":
                    visualizar(sumaMatriz(matriz1,matriz2));
                    break;
                case "b":
                    System.out.println("Escalar : ");
                    int num = Integer.parseInt(br.readLine());
                    visualizar(prodEscalarMatriz(matriz1,num));
                    break;
                case "c":
                    visualizar(productoMatriz(matriz1,matriz2));
                    break;
                case "d":
                    visualizar(traspuestaMatriz(matriz2));
                    break;
                    case "e":
                        default:
                        System.out.println(" Error no existe esa opcion ");
                        break;
            }
        }while (!opcion.equalsIgnoreCase("e"));

    }
}
