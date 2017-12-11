package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        System.out.println ( " Cuantos alumnos hay en clase : ");
        int tamanyo = Integer.parseInt (br.readLine ());

        String[] alumno = new String[tamanyo];
       int i;
       String buscar;
 // recorremos y luego almacenamos datos

           for (i = 0; i < alumno.length; i++) {
               System.out.println ("  Nombre del compañero :  : ");
               alumno[i] = br.readLine ();

           }

           do {
               System.out.println (" Que quieres buscar ");
               buscar = br.readLine ();

               // Buscamos en el arreglo
               char letra = buscar.charAt (0);
               System.out.println (" Hemos encontrado esos nombre : ");
               for (int j=0; j<alumno.length;j++){

                   char e = alumno[j].charAt (0);
                   if (e == letra){

                       System.out.println (alumno[j]);
                   }

               }


           }while (!buscar.equalsIgnoreCase ("fin"));


    }
}
