import java.util.Scanner;

/**
 * Ejercicio4
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i= sc.nextInt();
        switch (i) {
            case 0:
                System.out.println("Cero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
        
            default:
                System.out.println("No está incluído");
                break;
        }
        sc.close();
    }
}