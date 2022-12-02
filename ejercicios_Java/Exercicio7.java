package ejercicios_Java;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        double suma=0;
        double media;
        int contador=0;
        num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            suma=i+num;
            contador++;
        }
        media=suma/contador;
        System.out.println("suma= "+ suma + "\nmedia= " + media);
    }
}