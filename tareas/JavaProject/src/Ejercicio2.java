import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame o primeiro número: ");
        float num1 = sc.nextFloat();
        System.out.println("Dame o segundo número: ");
        float num2 = sc.nextFloat();

        System.out.println("A suma é " + (num1 + num2));

    }
}