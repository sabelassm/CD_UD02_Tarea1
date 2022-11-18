import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce a nota (0-10) para saber se é aprobado ou suspenso: ");
        int nota = sc.nextInt();
        if(nota<0){
            System.out.println("ERROR. A nota introducida ten que ter un valor entre 0 e 10.");
        } else if(nota>10){
            System.out.println("ERROR. A nota introducida ten que ter un valor entre 0 e 10.");
        } else {
            if(nota>=5){
                System.out.println("A nota " + nota + " é APROBADO");
            } else{
                System.out.println("A nota " + nota + " é SUSPENSO");
            }
        }
        sc.close();
    }
}