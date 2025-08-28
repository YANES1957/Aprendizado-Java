import java.util.Scanner;

public class DiferençaDeIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade1 = 0;
        int idade2 = 0;
        int diferenca = 0;
        System.out.println("Qual a idade da Maria?");
        idade1 = scanner.nextInt();
        System.out.println("Qual a idade do João?");
        idade2 = scanner.nextInt();
        diferenca = idade2 - idade1;
        System.out.println("A diferença de idade entre Maria e João é de " + diferenca + " anos " );


    }
}
