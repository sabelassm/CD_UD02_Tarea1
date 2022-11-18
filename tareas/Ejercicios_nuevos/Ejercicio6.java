package Ejercicios_nuevos;
import java.util.Scanner;
public class Ejercicio6
{
    public static void main(String[] args) 
    {
        int suma=0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer numero:");
        int num = teclado.nextInt();

        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Introduce el segundo numero:");
        int num2= teclado2.nextInt();

        if(num>num2){
            for(int i=num2;i<num+1;i++){
                suma+=i;
            }
        }
        else if(num==num2){
                suma+=num+num2;
        }
        else{
            for(int i=num;i<num2+1;i++){
                suma+=i;
            }
        }
        System.out.println(suma);
        teclado.close();
        teclado2.close();
    }
}