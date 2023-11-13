/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */

 import java.util.Scanner;

 public class ejercicio2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un nombre");
        String nombre1 = escaner.next();
        System.out.println("Introduce un nombre");
        String nombre2 = escaner.next();
        System.out.println("Introduce un nombre");
        String nombre3 = escaner.next();
        System.out.println("Introduce un nombre");
        String nombre4 = escaner.next();

        System.out.println("¡Hola "+nombre1+", "+nombre2+", "+nombre3+", "+nombre4+" !");
    }
 }