import java.util.Scanner;

public class WhileSomaDosPares {
  public static void main(String[] args) {
        boolean par = true;
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int soma = 0;
        System.out.println("digite um numero");
        int numero = scanner.nextInt();





        while (i<=numero) {
            if (i % 2 == 0 ) {
                System.out.println(i);
                soma+=i;
            }
            i++;
        }
        System.out.println("soma dos numeros pares" + soma);








        }
    }

