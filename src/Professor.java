public class Professor {
    String nome;
    String materia;
    String unidadeEscolar;

    void ensinar() {
        System.out.println("O professsor " + nome + " está ensinando a " + materia);
    }

    void exibirDados() {
        System.out.println("Professor: " + nome + ", Matéria: " + materia +  ", Unidade escolar: " + unidadeEscolar);
    }
}
