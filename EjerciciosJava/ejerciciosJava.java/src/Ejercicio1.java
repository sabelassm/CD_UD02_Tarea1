import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");

        int numero = sc.nextInt();

        if (numero % 2 == 0) {

            System.out.println("Es par");

        } else if (numero % 2 != 0) {

            System.out.println("Es impar");

        }

        else {

            System.out.println("Error");

        }

        sc.close();

    }
}
