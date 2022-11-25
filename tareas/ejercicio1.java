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

public class ejercicio1 {
  public static void main(String[] args) {
    //Título del programa
    System.out.println("************************************************");
    System.out.println("************SIGNO DEL ZODIACO CHINO*************");
    System.out.println("************************************************");
    // Creación do Scanner
    Scanner sc = new Scanner(System.in);
    // Creación e lectura das variables
    System.out.println("Introduce o teu ano de nacemento: ");
    int anoNacemento = sc.nextInt();
    //Programa que devolve o signo zodiacal chino
    int i = anoNacemento%12;
    switch(i){
      case 0: System.out.println("¡O teu signo zodiacal chino é o MONO!"); break;
      case 1: System.out.println("¡O teu signo zodiacal chino é o GALO!"); break;
      case 2: System.out.println("¡O teu signo zodiacal chino é o CAN!"); break;
      case 3: System.out.println("¡O teu signo zodiacal chino é o PORCO!"); break;
      case 4: System.out.println("¡O teu signo zodiacal chino é a RATA!"); break;
      case 5: System.out.println("¡O teu signo zodiacal chino é o BUEY!"); break;
      case 6: System.out.println("¡O teu signo zodiacal chino é o TIGRE!"); break;
      case 7: System.out.println("¡O teu signo zodiacal chino é o COELLO!"); break;
      case 8: System.out.println("¡O teu signo zodiacal chino é o DRAGÓN!"); break;
      case 9: System.out.println("¡O teu signo zodiacal chino é a SERPE!"); break;
      case 10: System.out.println("¡O teu signo zodiacal chino é o CABALO!"); break;
      case 11: System.out.println("¡O teu signo zodiacal chino é a CABUXA!"); break;
      default: System.out.println("Sinto, o teu ano non é válido, proba de novo."); break;
    }
    //Fin do programa



  }
}

//AFTER pa despues