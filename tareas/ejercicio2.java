/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduce un nome");
        String nome1=sca.nextLine();
        String nome2=sca.nextLine();
        String nome3=sca.nextLine();
        String nome4=sca.nextLine();

        System.out.println("¡Hola "+nome1+", "+nome2+", "+nome3+", "+nome4+"!");
    }
}