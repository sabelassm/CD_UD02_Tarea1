import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        int suma = 0;

        int cuenta = 0;

        String numString;

        int num;

        Scanner sc = new Scanner(System.in);

        do {

            cuenta++;

            System.out.print("Introduce número " + cuenta + " (00 para salir)" + ": ");

            numString = sc.nextLine().trim();

            num = Integer.parseInt(numString);

            suma += num;

        } while (!numString.equals("00"));

        sc.close();

        System.out.println("Suma: " + suma);

    }

}
