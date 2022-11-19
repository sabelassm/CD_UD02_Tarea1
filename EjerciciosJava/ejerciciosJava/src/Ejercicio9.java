import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una línea de números: ");

        String inversoString = sc.nextLine();

        sc.close();

        StringBuilder inverso = new StringBuilder(inversoString).reverse();

        System.out.println("Inverso: " + inverso);

    }

}
