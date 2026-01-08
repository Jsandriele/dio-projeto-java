import java.util.Scanner;

public class Exercicio2 {

    public static void main(String... args  ){
        System.out.println("Digite o valor dos lados do quadrado: ");
        Scanner scanner = new Scanner(System.in);

        var lado = scanner.nextInt();
        var quadrado = lado * 2;

        System.out.printf("O lado do quadrado  %s  os dois lados somam %s\n",lado,quadrado);



        var area = lado * lado;
        System.out.printf("Area do quadrado %s \n",area);
    }
}
