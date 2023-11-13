import java.util.Scanner;

public class Ejercicio2 {

    

/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String[] arrayNomes= new String[4];
    System.out.println("Introduce os nomes:");
    for (int i = 0; i < arrayNomes.length; i++) {
        arrayNomes[i]=entrada.nextLine();
        
    }
   System.out.println("Hola, "+arrayNomes[0]+", "+arrayNomes[1]+", "+arrayNomes[2]+", "+arrayNomes[3]);


    entrada.close();
}
}