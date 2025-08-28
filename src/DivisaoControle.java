import java.util.Scanner;

public class DivisaoControle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numeroBase = sc.nextInt();

        while (true) {
            System.out.print("Digite outro número: ");
            int numero = sc.nextInt();

            // Ignorar números menores que o primeiro
            if (numero < numeroBase) {
                System.out.println("Número ignorado (menor que o número inicial).");
                continue;
            }

            // Verificar se é divisível
            if (numero % numeroBase != 0) {
                System.out.println("Número não é divisível. Programa encerrado.");
                break;
            } else {
                System.out.println("Número divisível. Continue...");
            }
        }

        sc.close();
    }
}
