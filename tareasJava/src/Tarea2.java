import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        System.out.println("Dinos un número");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Dinos outro, porfa");
        int y = sc.nextInt();

        System.out.println("A suma vale " + x + y);
        sc.close();

    }
}