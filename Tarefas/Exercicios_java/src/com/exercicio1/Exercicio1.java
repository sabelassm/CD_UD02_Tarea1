package com.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) throws Exception {
    System.out.println("Introduce un número: ");
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    if (numero % 2 == 0) {
      System.out.println("O número é par.");
    } else if (numero % 2 != 0) {
      System.out.println("O número non é par.");
    } else {
      System.out.println("Erro, o número non é válido, volva a iniciar o programa e introduza un número válido.");
    }
    sc.close();
  }
}
