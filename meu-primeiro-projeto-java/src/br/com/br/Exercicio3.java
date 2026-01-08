package br.com.br;

import java.util.Scanner;
public class Exercicio3 {

    private final static String WELCAME_MESSAGE = "Olá escolha os lados dos retângulos";
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println(WELCAME_MESSAGE);

        System.out.println("Informe o valor do lado do retângulo:");
        var lado1 = scanner.nextInt();

        System.out.println("Escolha o valor da altura do retângulo:");
        var altura = scanner.nextInt();
        var area = lado1 * altura;

        System.out.printf("A altura é %s e a área do retangulo é %s \n",altura,area);

    }
}
