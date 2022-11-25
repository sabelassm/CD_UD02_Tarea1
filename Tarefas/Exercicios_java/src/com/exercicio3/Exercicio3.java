package com.exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a nota dun exame: ");
        double nota = sc.nextDouble();
        if (nota < 5) {
            System.out.println("Suspenso.");
        } else if (nota >= 5) {
            System.out.println("Aprobado.");
        } else {
            System.out.println("A nota non é válida.");
        }
        sc.close();
    }
}