import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");

        String num = sc.nextLine().trim();

        String fin = "";
        for (int i = 0; i < num.length(); i++) {
            fin = num.charAt(i) + fin;
        }
        System.out.println(fin);
        sc.close();
    }
}