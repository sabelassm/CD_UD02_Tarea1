import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce número 1: ");

        int num1 = sc.nextInt();

        System.out.print("Introduce número 2: ");

        int num2 = sc.nextInt();

        int mayor = num2;

        int menor = num1;

        int suma = 0;

        sc.close();

        if (num1 > num2) {

            mayor = num1;

            menor = num2;
        }

        for (int i = menor; i <= mayor; i++) {

            suma += i;

        }

        System.out.println("Suma: " + suma);

    }

}