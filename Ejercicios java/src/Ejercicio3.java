import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una nota.");
            double notas = sc.nextDouble();
            if (notas<0 || notas>10){
                do{
                    System.out.println("Esta nota no es válida.");
                    System.out.println("");
                    System.out.println("Escribe un número.");
                    notas = sc.nextDouble();
                }while(notas<0 || notas>10);
            }
        sc.close();
        if (notas<5){
            System.out.println("Suspenso");
        }else{
            System.out.println("Aprobado");
        }
    }
}
