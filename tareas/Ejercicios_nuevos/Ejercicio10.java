package Ejercicios_nuevos;
import java.util.Scanner;

public class Ejercicio10
{
    public static void main(String[] args) 
    {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer numero:");
        int num = teclado.nextInt();
        char operadores[]={'+','-','*','/'};

        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Introduce el segundo numero:");
        int num2= teclado2.nextInt();

        Scanner teclado3 = new Scanner(System.in);
        System.out.print("Introduce el operando (+,-,*,/):");
        char op= teclado3.nextLine().charAt(0);
  
        if(op==operadores[0]){
            System.out.println(num + num2);
        }
        else if(op==operadores[1]){
            System.out.println(num - num2);
        }
        else if(op==operadores[2]){
            System.out.println(num * num2);
        }
        else if(op==operadores[3]){
            System.out.println(num / num2);
        }

        teclado.close();
        teclado2.close();
        teclado3.close();
    }
}