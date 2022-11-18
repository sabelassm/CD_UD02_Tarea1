/* 
 * Signo del zodíaco
 * Crea que al introducir el año que naciste te devuelva
tu signo del zodíaco chino.
Para conocer el signo del horóscopo chino, debemos
dividir el año de nacimiento entre 12. El resto, entre
0 y 11, está asociado a un signo según la siguiente
tabla:

Mono
Gallo
Perro
Cerdo
Rata 
Buey 
Tigre
Conejo
Dragón
Serepiente
Caballo
Cabra 


 */
import java.util.Scanner;
 public class ejercicio1{
    public static void main(String[]args){
        System.out.println("Introduce tu año de nacimiento: ");
        Scanner sc=new Scanner(System.in);
        int ano=sc.nextInt();
        int zodiaco=ano%12;
        System.out.println("Tu horoscopo chino es:"+chinos[zodiaco]);

    }
    final static String[]chinos={"Mono","Gallo","Perro","Cerdo","Rata ","Buey ","Tigre","Conejo","Dragón","Serepiente","Caballo","Cabra"};
    
}