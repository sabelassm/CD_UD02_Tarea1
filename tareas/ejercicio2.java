/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”
 */

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        String nom1 = sca.nextLine();
        String nom2 = sca.nextLine();
        String nom3 = sca.nextLine();
        String nom4 = sca.nextLine();

        System.out.println("¡Hola "+nom1+", "+nom2+", "+nom3+", "+nom4+"!");

        sca.close();
    }
}
