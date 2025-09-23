public class Paciente{


        String nome;
        int idade;
        String endereco;
        String medico;
        String comorbidade;
        String tratamento;

    void exibirDados() {
        System.out.println("Nome do paciente: " + nome + "o enereço : " + endereco + "a idade do paciente é " + idade);
    }
        void exibirTratamento() {
            System.out.println( "O médico responsavel é: " + medico + "a comorbidade exsitente é: " + comorbidade +"o tratamento realizado é: "
+ tratamento);



        }
    }

