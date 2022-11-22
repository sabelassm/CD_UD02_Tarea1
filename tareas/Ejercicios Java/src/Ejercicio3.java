import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una nota: ");
        int nota = sc.nextInt();

        if (nota < 0 || nota > 10)
            System.out.println("Error. Escribe la nota adecuadamente.");
        
        if (nota < 5)
            System.out.println("Suspenso.");
        
        if (nota <= 10 && nota >= 5)
            System.out.println("Aprobado.");

        sc.close();
    }
}