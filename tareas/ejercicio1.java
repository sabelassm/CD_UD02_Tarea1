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
      int anhoNacimiento = 0;
      int resultado;

      System.out.println("Dime tu año de nacimiento");
      anhoNacimiento = teclado.nextInt();

      resultado = anhoNacimiento % 12;


      switch (resultado) {
         case 0:        System.out.println("Dime el primer nombre: ");
            System.out.println("Tu horóscopo es mono");
            break;
         case 1:
            System.out.println("Tu horóscopo es gallo");
            break;

         case 2:
            System.out.println("Tu horóscopo es perro");
            break;

         case 3:
            System.out.println("Tu horóscopo es cerdo");
            break;

         case 4:
            System.out.println("Tu horóscopo es rata");
            break;

         case 5:
            System.out.println("Tu horóscopo es buey");
            break;

         case 6:
            System.out.println("Tu horóscopo es tigre");
            break;

         case 7:
            System.out.println("Tu horóscopo es conejo");
            break;

         case 8:
            System.out.println("Tu horóscopo es dragón");
            break;

         case 9:
            System.out.println("Tu horóscopo es serpiente");
            break;

         case 10:
            System.out.println("Tu horóscopo es caballo");
            break;

         case 11:
            System.out.println("Tu horóscopo es cabra");
            break;

         
      }
        teclado.close();
    }
 }