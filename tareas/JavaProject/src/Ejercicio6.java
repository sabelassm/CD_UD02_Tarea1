import java.util.Scanner;

public class Ejercicio6{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame o primero número: ");
        int num1 = sc.nextInt();
        System.out.println("Dame o segundo número: ");
        int num2 = sc.nextInt();
        int a,b,suma =0;
        if(num1 > num2){
            a = num1; b= num2;
        }else{
            a = num2; b = num1;
        }

        for(int i = b; i <= a; i++ ){
            suma += i;
        }
        System.out.println(suma);
    }
}