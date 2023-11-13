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
        int anho = 0;
        int signo = 0;
        Scanner sca = new Scanner(System.in);

        System.out.println("Introduce el año en el que naciste");
        anho = sca.nextInt();

        signo = anho % 12;

        if (signo == 0) {
            System.out.println(" Tu signo es Mono");
        }
        if (signo == 1) {
            System.out.println("Tu signo es Gallo");
        }
        if (signo == 2) {
            System.out.println("Tu signo es Perro");
        }
        if (signo == 3) {
            System.out.println("Tu signo es Cerdo");
        }
        if (signo == 4) {
            System.out.println("Tu signo es Rata");
        }
        if (signo == 5) {
            System.out.println("Tu signo es Buey");
        }
        if (signo == 6) {
            System.out.println("Tu signo es Tigre");
        }
        if (signo == 7) {
            System.out.println("Tu signo es Conejo");
        }
        if (signo == 8) {
            System.out.println("Tu signo es Dragón");
        }
        if (signo == 9) {
            System.out.println("Tu signo es Serpiente");
        }
        if (signo == 10) {
            System.out.println("Tu signo es Caballo");
        }
        if (signo == 11) {
            System.out.println("Tu signo es Cabra");
        }
        
        sca.close();
    }

 }