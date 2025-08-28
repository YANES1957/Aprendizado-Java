import java.util.Scanner;

public class ExercicioImc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é a sua altura?");
        double altura = scanner.nextDouble();
        System.out.println("Qual é o seu peso");
        double peso = scanner.nextDouble();
        double imc = peso/ (altura* altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);
        if (imc < 18) {
            System.out.println("Baixo peso");
        } else if (imc < 25) {
            System.out.println("Dentro do peso");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Obesidade grau 1");
        } else if (imc<40){
            System.out.println("Obesidade grau 2");
        }else
        System.out.println("Obsidade grau 3");

        }
    }
