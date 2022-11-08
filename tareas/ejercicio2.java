/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */
import java.util.Scanner;
 public class ejercicio2{
    public static void main(String[]argas){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String persona1=sc.nextLine();
        System.out.println("Introduce un nombre");
        String persona2=sc.nextLine();
        System.out.println("Introduce un nombre");
        String persona3=sc.nextLine();
        System.out.println("Introduce un nombre");
        String persona4=sc.nextLine();
        System.out.println("Hola:"+persona1+","+persona2+","+persona3+","+persona4);
    }
 } 