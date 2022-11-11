import java.security.DigestOutputStream;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva 
un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”
*/
public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("*************************************************");
        System.out.println("******************SCRIPT NOMES*******************");
        System.out.println("*************************************************");
        //Creación do Scanner.
        Scanner sc = new Scanner(System.in);
        //Lectura das variables.
        System.out.println("Introduce un nome: ");
        String nome1= sc.nextLine();
        System.out.println("Agora outro: ");
        String nome2= sc.nextLine();
        System.out.println("Outro mais: ");
        String nome3= sc.nextLine();
        System.out.println("Un mais: ");
        String nome4= sc.nextLine();

        System.out.println("¡PERFECTO!");
        System.out.println(" ");
        System.out.println("Ola " + nome1 + ", " + nome2 + ", " + nome3 + " e " + nome4 + ".");

    }
}
