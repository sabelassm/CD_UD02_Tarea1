import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args) {
        
        int counter = 0;
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        num1 = sc.nextInt();
        counter++;
        System.out.println("Escribe otro número: ");
        num2 = sc.nextInt();
        counter++;
        if (counter == 2){
            sum = num1 + num2;
            System.out.println("La suma de esos números es: " + sum);
        }
        else{
            System.out.println("Error. Tienes que introducir adecuadamente los dos números a sumar.");
        }

        sc.close();
    }
}