import java.util.Scanner;

public class PadroesClasses {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String resposta = "";
        int resultado = 4;
        do {
            System.out.println("Quanto é 2+2?");
            resultado = scanner.nextInt();
            if (resultado == 4) {
                System.out.println("Voce acertou o resultado");
            } else {
                System.out.println("Voce errou resltado");
            }
            System.out.println("Voce deseja tentar a operação sim ou nao?");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("sim")); {
            System.out.println("Operção encerrada");
            scanner.close();
        }
    }
}



