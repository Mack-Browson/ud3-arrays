package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[][] matriz=new int[10][10];

        Random r =new Random();
        int aleatorio=r.nextInt(10);

        for (int i=0;i<matriz.length;i++){
            for (int j=0; j<matriz.length;j++){
                matriz[i][j]=aleatorio;
            }
        }

        //Mostrar
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
