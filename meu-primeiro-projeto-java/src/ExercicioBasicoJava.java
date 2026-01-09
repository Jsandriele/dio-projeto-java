import java.time.OffsetDateTime;
import java.util.Scanner;

public class ExercicioBasicoJava {


            private final static String WELCOME_MESSAGE = "Olá informe seu nome";

            public static void main(String[] args) {
                var baseYear = OffsetDateTime.now().getYear();
                Scanner scanner = new Scanner(System.in);
                System.out.println(WELCOME_MESSAGE);
                String name = scanner.nextLine();

                System.out.println("Informe o ano em que voçê nasceu:");
                int year = scanner.nextInt();
                int ageAtual = baseYear - year;
                System.out.printf("Olá %s, você tem  %d anos \n", name, ageAtual);
                scanner.close();




            }
}

