import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String linea = "";
        double numero = 0;
        double suma = 0;

        System.out.print("Introduce números para sumar (Pulsa 0 para mostrar la suma.): ");
        
        do {
            
            linea = sc.nextLine();

            linea.trim().replace(",", ".");

            numero = Double.parseDouble(linea);

            suma += numero;

        } while (!linea.equals("0"));
        
        System.out.println("La suma total es: " + suma);

        sc.close();
    }
}