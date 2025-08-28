import java.util.Arrays;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                char repetir;

                do {
                    System.out.println("Digite o primeiro número:");
                    double num1 = scanner.nextDouble();

                    System.out.println("Digite o segundo número:");
                    double num2 = scanner.nextDouble();

                    System.out.println("Escolha a operação (+, -, *, /):");
                    char operador = scanner.next().charAt(0);

                    double resultado = 0;
                    boolean operacaoValida = true;

                    switch (operador) {
                        case '+':
                            resultado = num1 + num2;
                            break;
                        case '-':
                            resultado = num1 - num2;
                            break;
                        case '*':
                            resultado = num1 * num2;
                            break;
                        case '/':
                            if (num2 != 0) {
                                resultado = num1 / num2;
                            } else {
                                System.out.println("Erro: divisão por zero!");
                                operacaoValida = false;
                            }
                            break;
                        default:
                            System.out.println("Operação inválida!");
                            operacaoValida = false;
                    }

                    if (operacaoValida) {
                        System.out.println("Resultado: " + resultado);
                    }

                    System.out.println("Deseja fazer outra operação? (s/n)");
                    repetir = scanner.next().charAt(0);

                } while (repetir == 's' || repetir == 'S');

                System.out.println("Calculadora encerrada.");
                scanner.close();
            }
        }
