import java.text.BreakIterator;
import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un día da semana en formato numérico para obtelo en texto:");
        int dia = sc.nextInt();
        switch(dia){
            case 1: 
                System.out.println("LUNS");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MÉRCORES");
                break;
            case 4:
                System.out.println("XOVES");
                break;
            case 5:
                System.out.println("VENRES");
                break;
            case 6:
                System.out.println("SÁBADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("ERROR. O valor introducido ten que estar entre 1 e 7.");
        }
        sc.close();
    }
}