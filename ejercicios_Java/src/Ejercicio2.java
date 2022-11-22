import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int i = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int j = sc.nextInt();

        int suma = i + j;

        System.out.println(i + " + " + j + " = " + suma);
        sc.close();
    }
}