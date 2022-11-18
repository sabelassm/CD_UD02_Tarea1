import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce unha nota: ");
        float num = sc.nextFloat();
        
        if(num < 5 && num >=0){
            System.out.println("Suspenso");
        }else if(num >= 5 && num <=10){
            System.out.println("Aprobado");
        }else{
            System.out.println("Nota inválida");
        }

    }
}