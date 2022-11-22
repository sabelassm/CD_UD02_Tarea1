import java.util.Scanner;

/**
 * Ejercicio3
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota: ");

        int i= sc.nextInt();

        if (i>=5&&i<=10&&i>=0) {
            System.out.println("Aprobado");
        }if(i>10||i<0) {
                System.out.println("Introduzca un valor válido");
        } else {
            System.out.println("Suspenso");
        }
        sc.close();
    }
}