/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */

import java.util.Scanner;

public class ejercicio2 {
 
    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el primer nombre: ");
       String nombre1 = teclado.nextLine();

        System.out.println("Dime el primer nombre: ");
        String nombre2 = teclado.nextLine();

        System.out.println("Dime el tercer nombre: ");
        String nombre3 = teclado.nextLine();

        System.out.println("Dime el cuarto nombre: ");
        String nombre4 = teclado.nextLine();


        System.out.println("¡Hola " + nombre1 + ", " + nombre2 + ", " + nombre3 + ", " + nombre4 + " !");

       teclado.close();
    }
 }