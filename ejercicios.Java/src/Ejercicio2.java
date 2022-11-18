import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero1=sc.nextInt();
        System.out.println("Introduce otro número: ");
        int numero2=sc.nextInt();
        int suma=numero1+numero2;
        System.out.println("La suma es= "+suma);
    }
}