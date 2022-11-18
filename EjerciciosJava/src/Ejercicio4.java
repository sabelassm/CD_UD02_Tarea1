import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entre 0 e 9 para obtelo escrito con letras:");
        int numero = sc.nextInt();
        switch(numero){
            case 0:
                System.out.println("CERO");
                break;
            case 1: 
                System.out.println("UN");
                break;
            case 2:
                System.out.println("DOUS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SETE");
                break;
            case 8:
                System.out.println("OITO");
                break;
            case 9:
                System.out.println("NOVE");
                break;
            default:
                System.out.println("ERROR. O valor introducido ten que estar entre 0 e 9.");
        }
        sc.close();
    }
}