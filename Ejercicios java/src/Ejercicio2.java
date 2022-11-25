import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args) {
        double suma = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe dos números.");
        double numero= sc.nextDouble();
        suma=numero;
        suma+= sc.nextDouble();
        sc.close();
        System.out.println("La suma de los dos números es "+suma);
    }
}