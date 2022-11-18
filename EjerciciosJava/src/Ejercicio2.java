import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce o primeiro número para facer unha suma:");
        int a = sc.nextInt();
        System.out.println("Introduce o segundo número para facer unha suma:");
        int b = sc.nextInt();

        sc.close();
        System.out.println("O resultado de " + a + " mais " + b + " é: " + (a + b));
    }
}