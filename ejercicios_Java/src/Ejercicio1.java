import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        
        int i = sc.nextInt();

        if (i % 2 == 0) {
            System.out.println(i + " es par");
        }else {
            System.out.println(i + " es impar");
        }
        sc.close();
    }
}