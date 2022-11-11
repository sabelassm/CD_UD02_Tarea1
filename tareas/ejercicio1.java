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
3 - Cerdo
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
        int nacimiento;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el año de nacimiento: ");
        nacimiento = sc.nextInt();

        nacimiento %= 12;

        switch (nacimiento) {
            case 0:
                System.out.println("mono");
                break;
            case 1:
                System.out.println("gallo");
                break;
            case 2:
                System.out.println("perro");
                break;
            case 3:
                System.out.println("cerdo");
                break;

            case 4:
                System.out.println("rata");
                break;
            case 5:
                System.out.println("buey");
                break;
            case 6:
                System.out.println("tigre");
                break;
            case 7:
                System.out.println("conejo");
                break;
            case 8:
                System.out.println("dragón");
                break;
            case 9:
                System.out.println("serpiente");
                break;
            case 10:
                System.out.println("caballo");
                break;

            case 11:
                System.out.println("cabra");
                break;

            default:
                throw new AssertionError();
        }

    }
}
