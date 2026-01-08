import java.time.OffsetDateTime;
import java.util.Scanner;

public class ExercicioBasicoJava {


            private final static String WELCAME_MESSAGE = "Olá informe seu nome";

            public static void main(String[] args) {
                var baseYear = OffsetDateTime.now().getYear();
                var scanner = new Scanner(System.in);
                System.out.println(WELCAME_MESSAGE);
                var name = scanner.nextLine();

                System.out.println("Informe o ano em que voçê nasceu:");
                var year = scanner.nextInt();
                var ageAtual = baseYear - year;
                System.out.printf("Olá %s, voçê tem  %d anos \n", name, ageAtual);
                scanner.close();




            }
}

