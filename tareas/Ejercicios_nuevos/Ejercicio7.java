package Ejercicios_nuevos;
import java.util.Scanner;
public class Ejercicio7
{
    public static void main(String[] args) 
    {
        double suma=0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero:");
        double num = teclado.nextDouble();

        for(int i=1;i<=num;i++){
            suma+=i;
        }
        System.out.println(suma/num);
        teclado.close();


    }
}