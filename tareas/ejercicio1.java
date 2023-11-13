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
3 - Cerdo
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

        Scanner escaner = new Scanner(System.in);
        System.out.println("En que ano naciches?");
        int ano = escaner.nextInt();
        int signo = ano % 12;

        if (signo >= 0 && signo <= 11) {
            switch (signo) {
                case 0:
                    System.out.println("Mono");
                    break;
                case 1:
                    System.out.println("Gallo");
                    break;
                case 2:
                    System.out.println("Perro");
                    break;
                case 3:
                    System.out.println("Cerdo");
                    break;
                case 4:
                    System.out.println("Rata");
                    break;
                case 5:
                    System.out.println("Buey");
                    break;
                case 6:
                    System.out.println("Tigre");
                    break;
                case 7:
                    System.out.println("Conejo");
                    break;
                case 8:
                    System.out.println("Dragón");
                    break;
                case 9:
                    System.out.println("Serpiente");
                    break;
                case 10:
                    System.out.println("Caballo");
                    break;

                case 11:
                    System.out.println("Cabra");
                    break;
            }
        }

        escaner.close();

    }

}