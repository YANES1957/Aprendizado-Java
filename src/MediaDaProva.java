import java.util.Scanner;

public class MediaDaProva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos tem na sala? ");
        int quantidadeAlunos = scanner.nextInt();

        int contadorAlunos = 1;
        double somaMedias = 0;

        while (contadorAlunos <= quantidadeAlunos) {
            System.out.println("\nAluno " + contadorAlunos + ":");

            double somaNotas = 0;
            int contadorNotas = 1;

            while (contadorNotas <= 4) {
                System.out.print("Digite a nota " + contadorNotas + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
                contadorNotas++;
            }

            double mediaAluno = somaNotas / 4;
            System.out.printf("Média do aluno %d: %.2f\n", contadorAlunos, mediaAluno);

            somaMedias += mediaAluno;
            contadorAlunos++;
        }

        double mediaSala = somaMedias / quantidadeAlunos;
        System.out.printf("\nMédia geral da sala: %.2f\n", mediaSala);

        scanner.close();
    }
}




