import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();

        if(num %2 == 0){
            System.out.println("O número "+ num + " é par");
        }
        else{
            System.out.println("O número "+ num + " non é par");
        }
        sc.close();
    }
}