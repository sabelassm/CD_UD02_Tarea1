import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        System.out.println("Introduce un número");
        Scanner sc=new Scanner(System.in);
        int nota=sc.nextInt();
        if(nota>5 && nota<=10){
            System.out.println("Has aprobado!");
        }
        else if(nota<5 && nota<=10){
            System.out.println("Has suspendido");
        }
        else{
            System.out.println("Nota inválida");
        }
    }
}