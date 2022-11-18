import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una nota: ");

        int nota = sc.nextInt();

        if (nota < 5) {

            System.out.println("SUSPENSO");

        } else if (nota >= 5 && nota <= 10) {

            System.out.println("APROBADO");

        } else {

            System.out.println("ERROR");

        }

    }

}