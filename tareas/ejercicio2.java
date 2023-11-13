/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] nombre = new String[4];
        System.out.println("Introduce cuatro nombres");
        for (int i = 0; i < nombre.length; i++) {
            nombre[i]= scanner.nextLine();
        }
        System.out.println("¡Hola "+nombre[0]+","+nombre[1]+","+nombre[2]+","+nombre[3]+"!");
        scanner.close();
    }
}