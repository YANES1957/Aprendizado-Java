import java.util.Scanner;

public class ListasNome {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    String nome[] = new String[5];
    int i =0;
    while (i<5)
    {

        System.out.print("Digite o nome" +  (i+1)   + ":");
        nome[i]  = entrada.nextLine();
        ++i;}
        System.out.println("Os nomes digitados foram:");
        i=0;
        while (i< 5) {
            System.out.println(nome[i]);
            i++;
        }


        }
    }


