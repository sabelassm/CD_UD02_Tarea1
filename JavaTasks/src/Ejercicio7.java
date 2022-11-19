import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número maior que 1");
        int num = sc.nextInt();
        double suma = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                suma += i;
            }
            System.out.println("O promedio entre " + num + " e 1 é: " + (suma / num));
        } else {
            System.out.println("Erro: o valor debe ser superior a 1");
        }
        sc.close();

    }
}