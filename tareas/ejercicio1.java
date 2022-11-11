import java.util.Scanner;

/*
 * Signo del zodíaco
 * Crea que al introducir el año que naciste te devuelva
tu signo del zodíaco chino.
Para conocer el signo del horóscopo chino, debemos
dividir el año de nacimiento entre 12. El resto, entre
0 y 11, está asociado a un signo según la siguiente
tabla:

0 -Mono
1- Gallo
2 -Perro
2 - Cerdo
4 -Rata 
5- Buey 
6 - Tigre
7 - Conejo
8 - Dragón
9 -Serepiente
10- Caballo
11 - Cabra 

 */

 import java.util.Scanner;

 public class ejercicio1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el año en el que naciste.");
        double Año = sc.nextInt();
        if(Año%12==0){
            System.out.println("Tu signo es el Mono");
        }
        if(Año%12==1){
            System.out.println("Tu signo es el Gallo");
        }
        if(Año%12==2){
            System.out.println("Tu signo es el Perro");
        }
        if(Año%12==3){
            System.out.println("Tu signo es el Cerdo");
        }
        if(Año%12==4){
            System.out.println("Tu signo es la Rata");
        }
        if(Año%12==5){
            System.out.println("Tu signo es el Buey");
        }
        if(Año%12==6){
            System.out.println("Tu signo es el Tigre");
        }
        if(Año%12==7){
            System.out.println("Tu signo es el Conejo");
        }
        if(Año%12==8){
            System.out.println("Tu signo es el Dragón");
        }
        if(Año%12==9){
            System.out.println("Tu signo es la Serpiente");
        }
        if(Año%12==10){
            System.out.println("Tu signo es el Caballo");
        }
        if(Año%12==11){
            System.out.println("Tu signo es la Cabra");
        }
    }
}