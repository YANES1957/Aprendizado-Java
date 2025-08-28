import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero de 1 até 7");
        var opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Fim de semana");
                    break;
                case 2:
                    System.out.println("Segunda");
                    break;

                case 3:
                    System.out.println("Terça");
                    break;
                case 4:
                    System.out.println("Quarta");
                    break;
                case 5:
                    System.out.println("Quinta");
                    break;
                case 6:
                    System.out.println("Sexta");
                    break;
                case 7:
                    System.out.println("Sabado");
                    break;
                default:
                    System.out.println("Numero invalido! Digite de 1 a 7");
            }


        }
    }
