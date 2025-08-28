import java.util.Scanner;

public class CrescenteDescresImparesPares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (maior): ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo número (menor): ");
        int segundo = scanner.nextInt();

        // Garante a ordem correta mesmo se o usuário inverter
        int maior = Math.max(primeiro, segundo);
        int menor = Math.min(primeiro, segundo);

        System.out.print("Digite 1 para ÍMPARES ou 2 para PARES: ");
        int opcao = scanner.nextInt();

        if (opcao != 1 && opcao != 2) {
            System.out.println("Opção inválida. Use 1 (ímpares) ou 2 (pares).");
            scanner.close();
            return;
        }

        System.out.println("\nListando de " + maior + " até " + menor + " (" +
                (opcao == 1 ? "ímpares" : "pares") + "):");

        for (int i = maior; i >= menor; i--) {
            boolean ehImpar = (i % 2 != 0);
            if ((opcao == 1 && ehImpar) || (opcao == 2 && !ehImpar)) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); // quebra de linha final
        scanner.close();
    }
}

