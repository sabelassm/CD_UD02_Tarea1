import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");

        String num = sc.nextLine().trim();
        int leng = num.length();
        String fin = "";
        for(int i=leng-1; i<=0; i--){
            fin = fin + num.charAt(i);
        }
        System.out.println(fin);
    }
}