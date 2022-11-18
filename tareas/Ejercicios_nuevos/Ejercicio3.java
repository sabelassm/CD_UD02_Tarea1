package Ejercicios_nuevos;
import java.util.Scanner;
public class Ejercicio3
{
    public static void main(String[] args) 
    {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la nota:");
        double num = teclado.nextDouble();

        if(0<=num && num<5){
            System.out.println("suspenso");
        }
        else if(10>=num && num>=5){
            System.out.println("aprobado");
        }
        else{
            System.out.println("nota invalida");
        }
        teclado.close();
    }
}