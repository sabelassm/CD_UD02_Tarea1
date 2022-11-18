import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int numero;
            System.out.println("Introduce un número");
            numero=sc.nextInt();
            if(numero%2==0){
                System.out.println("El número es par");
            }
            else if(numero%2!=0){
                System.out.println("El númer es impar");
            }
            else{
                System.out.println("Número es inválido");
            }
            sc.close();
            }
        }    

