import java.util.Scanner;
import java.lang.Math;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Math.abs(sc.nextInt());
        int suma = 0;
        String nums = "" + num;

        for(int i = 0; i<nums.length(); i++) {
            suma = suma + nums.charAt(i)-'0';
         }
        if (num % 3 == 0) {
            System.out.println("O número é divisible entre 3");
        } else {
            System.out.println("O número non é divisible entre 3");
        }
    }

}
