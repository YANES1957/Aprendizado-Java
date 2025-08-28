import java.util.Scanner;

public class Juros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double valor;
        Double juros;
        Double parcelas;
        Double ValorTotal;
        System.out.println("Quanto voce deseja pegar de imprestimo?");
        valor = entrada.nextDouble();
        System.out.println("Em quantas parcelas ira fazer o emprestimo?");
        parcelas = entrada.nextDouble();
        System.out.println("Qual o valor do juros?");
        juros = entrada.nextDouble();
        System.out.println("O valor de cada parcela será?");
        ValorTotal = valor*juros/100+parcelas;
        System.out.println(ValorTotal);



    }
}