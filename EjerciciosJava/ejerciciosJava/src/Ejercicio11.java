import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int resultado = 0;

        System.out.print("Introduce un número ");

        Long num = sc.nextLong();

        sc.close();

        if (num % 3 == 0) {

            System.out.println(num + " es múltiplo de 3");

        } else {

            System.out.println(num + " no es múltiplo de 3");
        }
    }
}
