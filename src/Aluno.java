public class Aluno {
    String nome;
    int idade;
    String endereco;
    String professor;
    String materia;
    String unidadeEscolar;

    void estudar() {
        System.out.println(nome + " está estudando " + materia +"com o professor: " + professor + "na unidade escolar: "  + unidadeEscolar);
    }

    void exibirDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + "reside no endereço " + endereco);
    }
}
