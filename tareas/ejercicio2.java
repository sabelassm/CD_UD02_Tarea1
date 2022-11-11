/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dinos o primeiro nome:");
        String nome1= sc.nextLine();
        System.out.println("Agora o segundo nome:");
        String nome2= sc.nextLine();
        System.out.println("O terceiro:");
        String nome3= sc.nextLine();
        System.out.println("E o último:");
        String nome4= sc.nextLine();

        System.out.println("Ola " + nome1 + ", " + nome2 + ", " + nome3 + " e " + nome4 + "!");


    }
}