import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args){
        System.out.println("Dinos un número porfa");
        Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

            if (x % 2 == 0) {
                System.out.println("É par!!");
            } else {
                System.out.println("Non é par :(");
            }
            sc.close();
    }
}
