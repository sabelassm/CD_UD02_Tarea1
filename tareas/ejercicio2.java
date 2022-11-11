/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */

 import java.util.Scanner;

 public class ejercicio2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer nombre.");
        String nombre1 = sc.nextLine();
        System.out.println("Escribe el segundo nombre.");
        String nombre2 = sc.nextLine();
        System.out.println("Escribe el tercer nombre.");
        String nombre3 = sc.nextLine();
        System.out.println("Escribe el cuarto nombre.");
        String nombre4 = sc.nextLine();

        System.out.println("¡Hola "+nombre1+", "+nombre2+", "+nombre3+" y "+nombre4+"!");
    }
}