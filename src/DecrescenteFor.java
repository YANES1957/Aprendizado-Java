import java.util.Scanner;

public class DecrescenteFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero");
        int maior = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        int menor = scanner.nextInt();
        System.out.println("A sequencia de numeros decrescentes é esta:");
        for (int i = maior; i >= menor; i--) {

            System.out.println(i);
        }
    }
}
