import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String linea = "";
        String lineaInversa = "";

        System.out.print("Escribe un número: ");

        linea = sc.nextLine();

        for (int i = 0; i < linea.length(); i++) {
            lineaInversa += linea.charAt(linea.length() - i -1);
        }

        System.out.println(lineaInversa);

        sc.close();
    }
}