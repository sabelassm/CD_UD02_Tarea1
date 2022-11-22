import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número entero: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Tu número es par.");
        }
        else{
            System.out.println("Tu número es impar.");
        }

        sc.close();
    }
}