import java.util.Scanner;

/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */

 public class ejercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el nombre de 4 personas: ");
        String nombre1 = sc.nextLine();
        String nombre2 = sc.nextLine();
        String nombre3 = sc.nextLine();
        String nombre4 = sc.nextLine();

        System.out.println("!Hola " + nombre1 + ", " + nombre2 + ", " + nombre3 + ", " + nombre4 +"!");
    }
 }