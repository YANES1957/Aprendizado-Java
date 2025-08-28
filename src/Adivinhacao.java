import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Escolha um numero");
        int numeroSorteado = random.nextInt(10) + 1;
        int tentativa = 0;
        System.out.println("Tente adivinhar um numero de 1 a 10");

        while (tentativa != numeroSorteado) {
            System.out.println("digite seu palpite");
            tentativa = scanner.nextInt();
            if (tentativa != numeroSorteado) {
                System.out.println("Numero errado. Tente novamente");
            } else

                System.out.println("Parabens! Voce acertou. O numero era:" + numeroSorteado);

        }
    }
}
