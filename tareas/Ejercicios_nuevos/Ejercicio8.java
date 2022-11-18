package Ejercicios_nuevos;
import java.util.Scanner;
public class Ejercicio8
{
    public static void main(String[] args) 
    {
        double suma=0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero:");
        double num = teclado.nextDouble();

        while(num!=0){
            suma+=num;
            System.out.print("Introduce el numero:");
            num = teclado.nextDouble();
        }

        System.out.println(suma);
        teclado.close();

    }
}