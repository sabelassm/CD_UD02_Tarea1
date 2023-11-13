import java.util.Scanner;

public class Ejercicio1 {
    /*
     * Signo del zodíaco
     * Crea que al introducir el año que naciste te devuelva
     * tu signo del zodíaco chino.
     * Para conocer el signo del horóscopo chino, debemos
     * dividir el año de nacimiento entre 12. El resto, entre
     * 0 y 11, está asociado a un signo según la siguiente
     * tabla:
     * 
     * 0 -Mono
     * 1- Gallo
     * 2 -Perro
     * 2 - Cerdo
     * 4 -Rata
     * 5- Buey
     * 6 - Tigre
     * 7 - Conejo
     * 8 - Dragón
     * 9 -Serepiente
     * 10- Caballo
     * 11 - Cabra
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    
        System.out.print("Ingresa tu año de nacimiento: ");
        int anoNacimiento = entrada.nextInt();

   
        String signoChino = obtenerSigno(anoNacimiento);
        System.out.println("Tu signo del zodíaco chino es: " + signoChino);

        
        entrada.close();
    }

    public static String obtenerSigno(int anoNacimiento) {
        String[] signosChinos = { "Mono", "Gallo", "Perro", "Cerdo", "Rata", "Buey", "Tigre", "Conejo", "Dragón",
                "Serpiente", "Caballo", "Cabra" };
        int indice = anoNacimiento % 12;
        return signosChinos[indice];
    }
}
