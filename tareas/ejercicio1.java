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
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("En que año naciste?");
        int nacimiento = sca.nextInt();
        int resto = nacimiento%12;
        
        switch(resto){
            case 0:
                System.out.println("tu signo zodiacal chino es un mono");
                break;
            case 1:
                System.out.println("tu signo zodiacal chino es un gallo");
                break;
            case 2:
                System.out.println("tu signo zodiacal chino es un perro");
                break;
            case 3:
                System.out.println("tu signo zodiacal chino es un cerdo");
                break;
            case 4: 
                System.out.println("tu signo zodiacal chino es una rata");
                break;
            case 5:
                System.out.println("tu signo zodiacal chino es un buey");
                break;
            case 6:
                System.out.println("tu signo zodiacal chino es un tigre");
                break;
            case 7:
                System.out.println("tu signo zodiacal chino es un conejo");
                break;
            case 8:
                System.out.println("tu signo zodiacal chino es un dragon");
                break;
            case 9:
                System.out.println("tu signo zodiacal chino es una serpiente");
                break;
            case 10:
                System.out.println("tu signo zodiacal chino es un caballo");
                break;
            case 11:
                System.out.println("tu signo zodiacal chino es una cabra");
                break;

        }
        sca.close();
    }
}