package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Que tamaño tendra el array : ");
        int tamanyo= Integer.parseInt(br.readLine());

        String[] alumnos =new String[tamanyo];
        //rellenar el array con los nombres de los alumnos
        for (int i=0;i<alumnos.length;i++){
            System.out.println(" Nombre y apellido ");
            alumnos[i]=br.readLine();
        }

        String buscar;
        //hacemos una busqueda en el array
        do{

            System.out.println(" Que estas buscando : ");
            buscar = br.readLine();

            //que letra desea buscar
            char letra =buscar.charAt(0);

            System.out.println(" Hemos encontrado : ");

            for (int i=0;i<alumnos.length;i++){
                char encontrado =alumnos[i].charAt(0);

                if (encontrado == letra){
                    System.out.println(alumnos[i]);
                }
            }
        }while(buscar.equalsIgnoreCase("fin"));
    }
}
