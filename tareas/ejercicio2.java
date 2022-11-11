/*
 * 


 */

 import java.util.Scanner;

 public class ejercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el 1º nombre");
        String primero = sc.nextLine();
        System.out.println("Introduzca el 2º nombre");
        String segundo = sc.nextLine();
        System.out.println("Introduzca el 3º nombre");
        String tercero = sc.nextLine();
        System.out.println("Introduzca el 4º nombre");
        String cuarto = sc.nextLine();

        System.out.println(" ¡Hola " + primero + ", " + segundo + ", " + tercero + ", " + cuarto + " !");
    }
 }