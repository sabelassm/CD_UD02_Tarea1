import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número entero positivo: ");
        int num = sc.nextInt();

        double suma = 0;
        int counter = 0;

        if (num < 0)
            System.out.println("Error");

        else{
            for(int i = 1; i <= num; i++){
                suma += i;
                counter++;
        }

        System.out.println(suma/counter);
        }

        sc.close();
        
    }
}