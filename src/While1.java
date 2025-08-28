import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nome = ""; // inicializa vazio para entrar no while

        while (!nome.equalsIgnoreCase("exit")) { // continua enquanto NÃO for "exit"
            System.out.print("Digite um nome (ou 'exit' para encerrar):");
            nome = scanner.next();

            if (!nome.equalsIgnoreCase("exit")) {

            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();

    }
    }
