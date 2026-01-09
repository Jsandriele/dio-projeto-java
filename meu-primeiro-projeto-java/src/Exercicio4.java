import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- PRIMEIRA PESSOA ---
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Limpeza de buffer: consome o '\n' que o nextInt() deixou
        scanner.nextLine();

        // --- SEGUNDA PESSOA ---
        System.out.print("Digite o nome da outra pessoa: ");
        // Agora o programa vai parar e esperar você digitar o nome
        String nome2 = scanner.nextLine();

        System.out.print("Digite a idade da outra pessoa: ");
        int idade2 = scanner.nextInt();

        // --- RESULTADO ---
        int difere = Math.abs(idade - idade2);

        System.out.println("\n--- Resumo ---");
        System.out.printf("Olá %s, sua idade é %d.\n", nome, idade);
        System.out.printf("Olá %s, sua idade é %d.\n", nome2, idade2);
        System.out.printf("A diferença de idade entre vocês é de %d anos.\n", difere);

        scanner.close();
    }
}