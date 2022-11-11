import java.util.Scanner;

public class Script {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNombres = 0;
        String saudo = "Hola";
        String[] nomes = null;
        do{

            System.out.println("Introduce catro nombres: \n");
            String nombres = sc.nextLine();

            nomes = nombres.split(" ");

            numNombres = nomes.length;
            System.out.println(numNombres);
        }while (numNombres <4);

        for(int i = 0; i < nomes.length; i++){
            String string = nomes[i];
                if(i==nomes.length-1){
                    saudo+= " " + string;
                }else {
                    saudo+= " " + string + ",";
                }
        }saudo +=" !";
        System.out.println(saudo);
    }
}