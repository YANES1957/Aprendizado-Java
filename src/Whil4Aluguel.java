import java.util.Scanner;

public class Whil4Aluguel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String casa = "";
        double valor;
        int quartos;
        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite o valor do aluguel");
            valor = scanner.nextDouble();
            System.out.println("Digite quantos quartos deseja");
            quartos = scanner.nextInt();
            if (valor == 1.200 && quartos == 2) {
                System.out.println("\n Casa encontrada. Parabens");
                break;

            } else {
               System.out.println("\n Procurar outra casa. Operação encerrada");
                System.out.println("Deseja procurar outra casa s/n?");
                String resposta = scanner.next();
                if (!resposta.equalsIgnoreCase("s")) {
                    System.out.println("Procura encerrada");
                   continuar = false;
                   scanner.close();


                }
            }
        }}}



