import java.util.Scanner;

public class BaseAltura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcule a base e a altura de um retangulo e imprima na tela");
        System.out.println("Digite a base");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura");
        double altura =scanner.nextDouble();
        double area = base * altura;
        System.out.println("A area de um retangulo é?" + area);


    }
}
