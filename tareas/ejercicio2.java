/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {    

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<4;i++){

        System.out.print("Introduce nombre "+(i+1)+": ");

            String  nombre=sc.nextLine();

            nombres[i]=nombre;
      
        }

        saludo(nombres[0],nombres[1],nombres[2],nombres[3]);

    }

    public static void saludo (String n1, String n2, String n3, String n4){

        System.out.print("¡Hola " +n1+", "+n2+", "+n3+", "+n4+" !");
        
    }

    public static String [] nombres=new String[4];

}