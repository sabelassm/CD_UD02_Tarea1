package Ejercicios_nuevos;
import java.util.Scanner;
 
public class Ejercicio4 {
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce numero:");
        int num = teclado.nextInt();
        teclado.close();
        String numero = "";
        if(num<0 || num>10){
            numero = "OTRO";
        }
        else{
        switch (num) {
            case 0: numero = "CERO"; break;
            case 1: numero = "UNO"; break;
            case 2: numero = "DOS"; break;
            case 3: numero = "TRES"; break;
            case 4: numero = "CUATRO"; break;
            case 5: numero = "CINCO"; break;
            case 6: numero = "SEIS"; break;
            case 7: numero = "SIETE"; break;
            case 8: numero = "OCHO"; break;
            case 9: numero = "NUEVE"; break;
        }
        }
        System.out.println(numero);
    }   
}