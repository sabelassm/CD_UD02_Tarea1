import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un día de la semana (del 1 al 7)");
        int dia = sc.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Luns");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Mércores");
                break;

            case 4:
                System.out.println("Xoves");
                break;

            case 5:
                System.out.println("Venres");
                break;

            case 6:
                System.out.println("Sábado");
                break;

            case 7:
                System.out.println("Domingo");
                break;
        
            default:
                System.out.println("Valor non válido.");
                break;
        }
        
        sc.close();
    }
}