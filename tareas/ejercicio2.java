/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */

import java.util.Scanner;

public class ejercicio2{
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("introduce los cuatro nombres que deseas ");
        String [] nombres = new String [4];
        for (int i=0;i<nombres.length;i++){
            nombres [i] = sca.nextLine();
        }
        for(int i=0;i<nombres.length;i++){
            System.out.println("Hola, "+nombres[i]);
        }
    }
 }