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
        System.out.println("Dinos o teu ano de nacemento:");
        Scanner sc = new Scanner(System.in);
        int ano = sc.nextInt();
        int num = ano % 12;
        switch (num) {
            case 0:
                System.out.println("Eres un mono");
                break;
            case 1:
                System.out.println("Eres un galo");
                break;
            case 2:
                System.out.println("Eres un can");
                break;
            case 3:
                System.out.println("Eres un porco");
                break;
            case 4:
                System.out.println("Eres unha rata");
                break;
            case 5:
                System.out.println("Eres un boi");
                break;
            case 6:
                System.out.println("Eres un tigre");
                break;
            case 7:
                System.out.println("Eres un coello");
                break;
            case 8:
                System.out.println("Eres un dragón");
                break;
            case 9:
                System.out.println("Eres unha serpe");
                break;
            case 10:
                System.out.println("Eres un cabalo");
                break;
            case 11:
                System.out.println("Eres unha cabra");
        }

    }
}

