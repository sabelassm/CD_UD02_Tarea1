/*
 * 
 * Haz un script que reciba por parámetro al menos 4 nombres de persona y
 * devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan,
 * Manuel !”
 * 
 */

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un nome: ");
        String nombre1 = sc.nextLine();
        System.out.println("Dime un nome: ");
        String nombre2 = sc.nextLine();
        System.out.println("Dime un nome: ");
        String nombre3 = sc.nextLine();
        System.out.println("Dime un nome: ");
        String nombre4 = sc.nextLine();

        System.out.println("¡Ola " + nombre1 + ", " + nombre2 + ", " + nombre3 + ", " + nombre4 + " !");
    }
}
