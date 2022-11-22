import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");

        double num1 = sc.nextDouble();

        System.out.print("Introduce otro número: ");

        double num2 = sc.nextDouble();

        System.out.print("Qué operación quieres hacer? (+, -, *, /): ");

        char signo = sc.next().charAt(0);

        switch (signo){
            
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;

            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;

            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;

            default:
                System.out.println("Error.");
                break;
        }


        sc.close();
    }
}