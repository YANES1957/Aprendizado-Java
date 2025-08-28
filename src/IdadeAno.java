import java.util.Scanner;

public class IdadeAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nascimento = 0;
        int ano = 2025;
        System.out.println("Em que ano voce nasceu?");
        nascimento = scanner.nextInt();
        int idade = ano - nascimento;
        System.out.println("Então voce tem " + idade + " anos ");
    }
}
