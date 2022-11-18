import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        String dias[]={"Lunes","Martes","Miércoles","Jueves","Viernes","Sabado","Domingo"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba un dia del 1/7: ");
        int dia=sc.nextInt();
        System.out.println(dias[dia]);
    }
}