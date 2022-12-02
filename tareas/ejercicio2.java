import java.util.Scanner;

/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */

public class ejercicio2{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String nome1= sc.nextLine();
        String nome2= sc.nextLine();
        String nome3= sc.nextLine();
        String nome4= sc.nextLine();
        System.out.println("Hola " + nome1 + "," + nome2 + "," + nome3 + "," + nome4 + "!");
        sc.close();
    }
}