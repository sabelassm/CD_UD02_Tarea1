package Ejercicios_nuevos;
import java.util.Scanner;
 
public class Ejercicio5 {
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce numero:");
        int num = teclado.nextInt();
        teclado.close();
        String numero = "";
        if(num<1 || num>7){
            numero = "valor no valido";
        }
        else{
        switch (num) {
            case 1: numero = "lunes"; break;
            case 2: numero = "martes"; break;
            case 3: numero = "miercoles"; break;
            case 4: numero = "jueves"; break;
            case 5: numero = "viernes"; break;
            case 6: numero = "sabado"; break;
            case 7: numero = "domingo"; break;
        }
        }
        System.out.println(numero);
    }   
 
}