import java.util.*;

public class Script {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lonxitude = 0;
        String nomesComas = "¡Hola";
        String[] nomes = null;
        do {
            System.out.println("Introduce unha serie de catro ou máis nomes, separados por espazos: \n");

            String string = sc.nextLine();

            

            nomes = string.split(" ");

            lonxitude = nomes.length;
            System.out.println(lonxitude);
                
        } while (lonxitude <4);
        
        for( int i = 0; i < nomes.length; i++){
            String elemento = nomes[i];
            if (i==nomes.length-1) {
                nomesComas+= " " + elemento;
            } else {
                nomesComas += " " + elemento +",";
            }
            
            
        }
        nomesComas += " !";
        
        System.out.println(nomesComas);

        
    }
}
