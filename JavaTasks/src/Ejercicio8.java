import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int sair = 0;
        System.out.println("Introduce os números que queiras sumar (preme 0 para saír): ");
        do {
            double num = sc.nextDouble();
            if (num == 0) {
                sair = 1;
            } else {
                suma += num;
            }

        } while (sair != 1);
        System.out.println(suma);
        sc.close();
    }
}