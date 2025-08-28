import java.util.Scanner;

public class whieSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            int soma = num1 + num2;
            System.out.println("A soma dos dois números é: " + soma);

            System.out.print("Deseja continuar? (S para sim / ILE para encerrar): ");
            opcao = scanner.next();

        } while (opcao.equalsIgnoreCase("S"));

        System.out.println("Programa encerrado.");
        scanner.close();






        }}