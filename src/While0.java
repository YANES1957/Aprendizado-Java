import java.util.Scanner;

public class While0 {
    public static void main(String[] args) {
        int N = 0;
        int i=0;

        Scanner entrada= new Scanner(System.in);
            System.out.println("Digite um numero e ira parar neste numero");
            N = entrada.nextInt();
        while (i<=N){


            System.out.println(i);
            i++;
        }

    }
}
