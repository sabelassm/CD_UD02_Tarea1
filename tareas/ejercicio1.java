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
        System.out.println("Dime o teu ano de nacemento: ");
        int anoNacemento = sc.nextInt() % 12;

        switch (anoNacemento) {
            case 0:
                System.out.println("Tu signo del zodíaco chino es: Mono");
                break;
            case 1:
                System.out.println("Tu signo del zodíaco chino es: Gallo");
                break;
            case 2:
                System.out.println("Tu signo del zodíaco chino es: Perro");
                break;
            case 3:
                System.out.println("Tu signo del zodíaco chino es: Cerdo");
                break;
            case 4:
                System.out.println("Tu signo del zodíaco chino es: Rata");
                break;
            case 5:
                System.out.println("Tu signo del zodíaco chino es: Buey");
                break;
            case 6:
                System.out.println("Tu signo del zodíaco chino es: Tigre");
                break;
            case 7:
                System.out.println("Tu signo del zodíaco chino es: Conejo");
                break;
            case 8:
                System.out.println("Tu signo del zodíaco chino es: Dragón");
                break;
            case 9:
                System.out.println("Tu signo del zodíaco chino es: Serpiente");
                break;
            case 10:
                System.out.println("Tu signo del zodíaco chino es: Caballo");
                break;
            case 11:
                System.out.println("Tu signo del zodíaco chino es: Cabra");
                break;
        }
    }
}
