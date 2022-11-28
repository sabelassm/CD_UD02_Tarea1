import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        int suma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");

        int num = sc.nextInt();

        while (num <= 0) {

            System.out.print("Número incorrecto, introduce un número entero positivo: ");

            num = sc.nextInt();
        }

        sc.close();

        for (int i = 1; i <= num; i++) {

            suma += i;

        }

        System.out.println("Promedio: " + suma / num);

    }

}
