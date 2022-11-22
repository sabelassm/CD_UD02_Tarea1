import java.util.Scanner;

/**
 * Ejercicio6
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma=0;
        int prim= sc.nextInt();
        int sec= sc.nextInt();

        if (prim>sec){
        for(int i=sec; i<prim;i++){
            suma=prim+i+sec;
            }
                System.out.println(suma);
        }
        if (sec>prim){
            for(int i=prim; i<sec;i++){
                suma=sec+i+prim;
                }
                System.out.println(suma);
            }
        
    sc.close();
    }
}