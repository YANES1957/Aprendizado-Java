import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;

        System.out.println("Digite um numero para ver a tabuada");
        int n = scanner.nextInt();
        System.out.println(" A tabuada do " + n + " é:");
        while (i <= 10) {

            System.out.println( n+ " x " + i + " = " + (n * i));
            i++;


        }
    }
}