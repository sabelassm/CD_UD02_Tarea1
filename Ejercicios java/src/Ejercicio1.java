import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número.");
        double numero= sc.nextDouble();
        sc.close();
        if (numero%2==0){
            System.out.println("El número es par.");
        }else{
            System.out.println("El número es impar.");
        }
    }
}