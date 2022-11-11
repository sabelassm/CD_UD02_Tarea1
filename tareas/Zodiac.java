import java.util.*;

public class Zodiac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa determinará o teu signo do zodíaco chino seguindo o teu ano de nacemento");
        System.out.println("Por favor, introduce o teu ano de nacemento: ");

        int ano = sc.nextInt();

        int resto = ano % 12;

        String[] signos = { "o mono", "o galo", "o can", "o porco", "a rata", "o boi", "o tigre", "o coello",
                "o dragón", "a serpe", "o cabalo", "a cabra" };

        System.out.println("O teu signo do zodíaco é " + signos[resto]);

    }
}