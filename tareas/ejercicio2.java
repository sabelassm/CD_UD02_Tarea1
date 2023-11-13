/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre1;
        String nombre2;
        String nombre3;
        String nombre4;

        System.out.println("Permitidme que os salude correctamente:");
        
        System.out.println("Dime un nombre: ");
        nombre1= teclado.nextLine();
        nombre2= teclado.nextLine();
        nombre3= teclado.nextLine();
        nombre4= teclado.nextLine();
        System.out.println("¡Hola "+nombre1+", "+nombre2+", "+nombre3+", "+nombre4+"!");
        
        teclado.close();
    }
}