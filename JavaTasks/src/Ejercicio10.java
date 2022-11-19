import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce unha operacion no formato a b *");
        String[] array = sc.nextLine().split(" ");
        double a = Double.parseDouble(array[0]);
        double b = Double.parseDouble(array[1]);
        char c = array[2].charAt(0);

        switch (c) {
            case '*':
                System.out.println(a * b);
                break;
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                System.out.println(a / b);
                break;

            default:
                System.out.println("Os valores introducidos son inválidos");
                break;
        }

    }
}
