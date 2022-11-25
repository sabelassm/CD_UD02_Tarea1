package Ejercicios_nuevos;
import java.util.Scanner;
public class Ejercicio11
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero:");
        long num = teclado.nextLong();
        
        if(num%3==0){
            System.out.println("Es multiplo de 3");
        }
        else{
            System.out.println("No es multiplo de 3");
        }

        teclado.close();
    }
}