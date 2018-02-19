package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        int[][] matriz =new int[3][3];
        // Pedir valor al usuario
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                System.out.println("Inserte valores : ");
                matriz[i][j]=Integer.parseInt(br.readLine());
            }
        }

        //visualizar la matriz
        for (int i=0;i<matriz.length;i++){
            for (int j=0; j<matriz.length;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
