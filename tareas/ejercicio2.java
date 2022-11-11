/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */

import java.util.Scanner;

 public class ejercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el primer nombre: ");
            String a = sc.nextLine();
            System.out.println("Introduce el segundo nombre: ");
            String b = sc.nextLine();
            System.out.println("Introduce el tercer nombre: ");
            String c = sc.nextLine();
            System.out.println("Introduce el cuarto nombre: ");
            String d = sc.nextLine();

            System.out.println("¡Hola " + a + ", " + b + ", " + c + ", " + d + " !");
    }
 }