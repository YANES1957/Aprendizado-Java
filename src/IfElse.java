import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Infomre seu nome");
        String nome = scanner.nextLine();
        System.out.println("Informe sua idade?");
        int idade = scanner.nextInt();
        System.out.println("Voce é emancipado?");
        var emancipado = scanner.next().equalsIgnoreCase("sim") ;

        if (idade >= 16) {
            System.out.printf("%s Voce tem %d anos. Está apto a digigir. Parabens \n", nome, idade);

        }else {
            System.out.printf("%s voce tem %d anos e não está apto para dirigir \n", nome , idade);
        }


      }


    }

