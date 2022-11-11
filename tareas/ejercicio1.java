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

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el año de nacimiento");
        int ano = sc.nextInt();
        int signo = ano % 12;

        switch (signo) {
            case 0:
                System.out.println("Tu signo zodiacal es Mono");
                break;
            case 1:
                System.out.println("Tu signo zodiacal es Gallo");
                break;
            case 2:
                System.out.println("Tu signo zodiacal es Perro");
                break;
            case 3:
                System.out.println("Tu signo zodiacal es Cerdo");
                break;
            case 4:
                System.out.println("Tu signo zodiacal es Rata");
                break;
            case 5:
                System.out.println("Tu signo zodiacal es Buey");
                break;
            case 6:
                System.out.println("Tu signo zodiacal es Tigre");
                break;
            case 7:
                System.out.println("Tu signo zodiacal es Conejo");
                break;
            case 8:
                System.out.println("Tu signo zodiacal es Dragón");
                break;
            case 9:
                System.out.println("Tu signo zodiacal es Serpiente");
                break;
            case 10:
                System.out.println("Tu signo zodiacal es Caballo");
                break;
            case 11:
                System.out.println("Tu signo zodiacal es Cabra");
                break;
            default:
                System.out.println("El valor introducido debe estar entre los valores de 1 y de 12.");

        }
    }

}
