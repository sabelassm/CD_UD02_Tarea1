import java.util.Scanner;

public class Zodiaco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Introduce o teu ano de nacemento");
            int ano = sc.nextInt();

            int resto = ano % 12;

            String[] signo = {"Mono", "Galo", "Can", "Porco", "Rata", "Boi", "Tigre", "Conexo", "Dragon", "Serpiente", "Cabalo", "Cabra"};

            System.out.println("O teu signo é: " + signo[resto]);

    }
}
