package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void contarLetra(String texto,String alfabeto,int[] recuento){

   for (int i=0; i<texto.length();i++){
       char letra=texto.charAt(i);
       for (int j=0; j<alfabeto.length();j++){
           if (alfabeto.charAt(j) == letra){
               recuento[j]+=1;
           }
       }
   }

    }

    public static void visualizarRecuento(String abc, int[] recuento){
        for (int i=0; i<recuento.length;i++){
            if (recuento[i] >0){
                System.out.println(abc.charAt(i)+ " : "+recuento[i]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Escribe : ");
        String texto=br.readLine().toUpperCase();
        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

        int[] recuento=new int[alfabeto.length()];
        contarLetra(texto,alfabeto,recuento);
        visualizarRecuento(alfabeto,recuento);

    }
}
