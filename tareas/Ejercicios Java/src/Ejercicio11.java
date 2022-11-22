import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");

        String number = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            
            sum += number.charAt(i);

        }

        if (sum % 3 == 0){

            System.out.println("Tu número es múltiplo de 3.");

        } else {

            System.out.println("Tu número no es múltiplo de 3.");

        }


        sc.close();
    }
}