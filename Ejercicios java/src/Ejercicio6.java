import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int suma = 0;
        
        for(int i=a+1; i>b; i++){
            suma+=i;
        }
        
        System.out.println("La suma es= "+ suma);
    }
}