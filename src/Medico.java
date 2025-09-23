public class Medico {

;
    String nome;
    String endereço;
    String UBS;
    String medico;
    String especialidade;
    String comorbidade;
    String tratamento;


    void exibirEspecialidade() {
        System.out.println("O médico " + nome + "é da seguinte especiadade: " + especialidade );
    }

    void exibirDados() {
                System.out.println("O doutor: " + nome + "atende na UBS " + UBS + " na rua " + endereço);
        }
        }
