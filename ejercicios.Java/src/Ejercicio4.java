import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        String numeros[]={"CERO","UNO","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int numero=sc.nextInt();
        System.out.println(numeros[numero]);
    }
}