import java.util.Scanner;

enum NUMBERS {CERO, UN, DOUS, TRES, CATRO, CINCO, SEIS, SETE, OITO, NOVE}

public class Ejercicio4{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();

        if (num < 0 || num > 9)
            System.out.println("OUTRO");
        
        else{
            System.out.println(NUMBERS.values()[num]);
        }

        sc.close();
    }
}