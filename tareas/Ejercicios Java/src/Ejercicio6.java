import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        int num1 = sc.nextInt();
        System.out.print("Escribe otro número mayor: ");
        int num2 = sc.nextInt();

        int suma = 0;

        if (num1>num2) {

            System.out.println("Error");

        } else {

            for(int i = num1; i <= num2; i++){
                suma += i;
            }
            System.out.println(suma);
        }
        
        sc.close();
    }
}