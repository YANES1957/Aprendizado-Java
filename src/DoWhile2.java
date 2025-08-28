import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var nome = "";

        do {
            System.out.println("informe seu nome");
            nome = scanner.next();
        } while (!nome.equals("exit"));
        System.out.println("Programa encerrado");
        scanner.close();

    }
}