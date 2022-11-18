import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce número: ");


        System.out.println(getDiaSemana(sc.nextInt()));


    }

    public static String getDiaSemana(int i){
        
        return dias[i-1];

    }

    public final static String [] dias={"LUNES","MARTES","MIÉRCOLES","JUEVES","VIERNES","SÁBADO","DOMINGO"};
}