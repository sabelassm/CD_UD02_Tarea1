import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número enteiro para saber si é par ou impar:");
        int numero = sc.nextInt();
        if(numero%2 == 0){
            System.out.println("O número " + numero + " é PAR.");
        }else{
            System.out.println("O número " + numero + " é IMPAR.");
        }
        sc.close();
    }
}