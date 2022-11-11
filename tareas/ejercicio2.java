import java.util.Scanner;

/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */
public class ejercicio2{

    public static void main(String[] args) {
        String nombre1;
        String nombre2;
        String nombre3;
        String nombre4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dinos 4 nombres de persona: ");
        nombre1= sc.next();
        nombre2 = sc.next();
        nombre3 = sc.next();
        nombre4= sc.next();
        System.out.println("Hola "+nombre1+","+nombre2+","+nombre3+","+nombre4);
    }
}