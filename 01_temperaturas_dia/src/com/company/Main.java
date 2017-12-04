package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
	/*

	Pide al usuario las temperaturas de un día (un valor cada hora durante 24 horas) y almacénalas en un array.

    Usando los datos contenidos en el array, calcula la temperatura media, la máxima y la mínima.

   Visualiza la información en forma de gráfico de barras.

	 */

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int hora;
        System.out.print (" Dame el tamanyo del array : ");
        hora = Integer.parseInt (br.readLine ());
        int[] temperatura = new int[hora]; // creamos el array y el espacio que ocupará en la memoria
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;

       max=min= temperatura[0];
        for (int i = 0; i< temperatura.length ; i++){
            System.out.print ("Escribe la temperatura : ");
            temperatura[i] = Integer.parseInt (br.readLine ());

            if (temperatura[i]>max){
                max = temperatura[i];
            }
            if (temperatura[i]<min){
                min = temperatura[i];
            }
        }

        for (int j=0; j<temperatura.length; j++){

            System.out.print (j);

            System.out.print (" ");

            for (int i = 0; i < temperatura[j]; i++) {
                System.out.print ("* ");
            }

            System.out.print (temperatura[j]);

            if (temperatura[j]==max){
                System.out.print (" ---->  MAX");
            }
            if (temperatura[j]== min){
                System.out.println ("----> MIN");
            }

            System.out.println ();
        }


    }
}
