package Ejercicios_nuevos;
import java.util.Scanner;
public class Ejercicio9
{
    public static void main(String[] args) 
    {
        int resto=0 ,invertido=0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero:");
        int num = teclado.nextInt();

        while( num > 0 ) {
            resto = num % 10;
            invertido = invertido * 10 + resto;
            num /= 10;
         }

        System.out.println(invertido);
        teclado.close();

    }
}