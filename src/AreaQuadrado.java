import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da area do quadrado");
      double lado = scanner.nextDouble();
      double area =  lado* lado;
        System.out.println("A area quadrado é" + area);

}}

