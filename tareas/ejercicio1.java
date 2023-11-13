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
9 -Serpiente
10- Caballo
11 - Cabra 

 */

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce año de nacimiento");
        int anho = scanner.nextInt();
        int signo = anho%12;
        switch (signo) {
            case 0:
                System.out.println("Año del mono");
                break;
            case 1:
                System.out.println("Año del gallo");
                break;
            case 2:
                System.out.println("Año del perro");
                break;
            case 3:
                System.out.println("Año del cerdo");
                break;
            case 4:
                System.out.println("Año del rata");
                break;
            case 5:
                System.out.println("Año del buey");
                break;
            case 6:
                System.out.println("Año del tigre");
                break;
            case 7:
                System.out.println("Año del conejo");
                break;
            case 8:
                System.out.println("Año del dragón");
                break;
            case 9:
                System.out.println("Año del serpiente");
                break;
            case 10:
                System.out.println("Año del caballo");
                break;
            case 11:
                System.out.println("Año del cabra");
                break;
            default:
                break;
        }


        scanner.close();
    }
}