import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int resultado = 0;

        System.out.print("Introduce dos números y una operación: ");

        String operacionString = sc.nextLine().trim();

        sc.close();

        int num1 = Integer.parseInt(operacionString.substring(0, 1));

        int num2 = Integer.parseInt(operacionString.substring(1, 2));

        if (operacionString.substring(2, 3).equals("+")) {

            resultado = num1 + num2;

        } else if (operacionString.substring(2, 3).equals("-")) {

            resultado = num1 - num2;

        } else if (operacionString.substring(2, 3).equals("*")) {

            resultado = num1 * num2;

        } else if (operacionString.substring(2, 3).equals("/")) {

            resultado = num1 / num2;

        }

        System.out.println("Resultado: " + resultado);
    }

}
