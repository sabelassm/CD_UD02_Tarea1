package Ejercicios_nuevos;
import java.util.Scanner;
public class Ejercicio2
{
    public static void main(String[] args) 
    {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer numero:");
        int num = teclado.nextInt();

        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Introduce el segundo numero:");
        int num2= teclado2.nextInt();

        System.out.println(num + num2);

        teclado.close();
        teclado2.close();

    }
}