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
        Scanner teclado = new Scanner(System.in);

        int anhoUsuario;
        
        System.out.println("Voy a decirte tu signo en el horóscopo chino");
        System.out.println("¿En qué año naciste? ");
        anhoUsuario = teclado.nextInt();
        int resto = anhoUsuario%12;

        switch (resto) {
            case 0:
                System.out.println("Tu signo es Mono");
                break;
            case 1:
                System.out.println("Tu signo es Gallo");
                break;
            case 2:
                System.out.println("Tu signo es Perro");
                break;
            case 3:
                System.out.println("Tu signo es Cerdo");
                break;
            case 4:
                System.out.println("Tu signo es Rata");
                break;
            case 5:
                System.out.println("Tu signo es Buey");
                break;
            case 6:
                System.out.println("Tu signo es Tigre");
                break;
            case 7:
                System.out.println("Tu signo es Conejo");
                break;
            case 8:
                System.out.println("Tu signo es Dragón");
                break;
            case 9:
                System.out.println("Tu signo es Serpiente");
                break;
            case 10:
                System.out.println("Tu signo es Caballo");
                break;
            case 11:
                System.out.println("Tu signo es Cabra");
                break;
            default:
            System.out.println("No has introducido un número correcto");
                break;
        }

    teclado.close();
    }
}