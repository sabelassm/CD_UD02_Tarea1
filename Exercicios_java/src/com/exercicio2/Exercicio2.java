package com.exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce outro número: ");
        int num2 = sc.nextInt();
        System.out.println("A suma é : " + (num1 + num2));
        sc.close();
    }
}