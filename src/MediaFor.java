import java.util.Scanner;

public class MediaFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite a" + i + "nota");
            double nota = scanner.nextDouble();
            soma += nota;
            double media = soma;
            System.out.println("media" + media);
            if (media <= 5) {
                System.out.println("Voce foi aprovado /TRUE");
            } else {
                System.out.println("Voce foi reprovado/ False");
                scanner.close();
            }
        }
    }}








