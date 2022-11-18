import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dinos a nota");
        int nota = sc.nextInt();

        if (0 <= nota && nota <= 10) {
            if (nota < 5) {
                System.out.println("Suspendeches, papón");
            } else {
                System.out.println("Moi ben, rei");
            }
        } else {
            System.out.println("Aprende a escribir");
        }
        sc.close();
    }
}