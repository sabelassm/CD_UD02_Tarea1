import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número");
        int num = sc.nextInt();

        switch (num) {
            case 0:
                System.out.println("Cero");
                break;

            case 1:
                System.out.println("Un");
                break;

            case 2:
                System.out.println("Dous");
                break;

            case 3:
                System.out.println("Tres");
                break;

            case 4:
                System.out.println("Catro");
                break;

            case 5:
                System.out.println("Cinco");
                break;

            case 6:
                System.out.println("Seis");
                break;

            case 7:
                System.out.println("Sete");
                break;

            case 8:
                System.out.println("Oito");
                break;

            case 9:
                System.out.println("Nove");
                break;

            default:
                System.out.println("Outro");
                break;
        }
    }
}