import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println(" Me diga seu nome ?");
        nome =  scanner.nextLine();
        System.out.println("Me diga a sua idade?");
         idade = scanner.nextInt();
        boolean resultado  = nome.equals("roberto") && idade == 18;
        System.out.println(resultado);







    }
}
