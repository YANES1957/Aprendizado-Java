public class Main {
    public static void main(String[] args) {
        // Alunos
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Renato dias";
        aluno1.idade = 20;
        aluno1.endereco = "Rua das Camélias 234 - Pae Cará";
        aluno1.professor = "Carlos";
        aluno1.materia = "Matemática";
        aluno1.unidadeEscolar = "SESI";
        aluno1.exibirDados();

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Sofia Reis";
        aluno2.idade = 22;
        aluno2.endereco = "Rua A bloco B n. 98 - Vila Alice";
        aluno2.professor = "Amanda";
        aluno2.materia = "Portugues";
        aluno2.unidadeEscolar = "SESI";
        aluno2.exibirDados();


        Aluno aluno3 = new Aluno();
        aluno3.nome = "Fernanda da Silva";
        aluno3.idade = 22;
        aluno3.endereco = "Rua Julio Pedro Pontes n. 415 - Vila Alice";
        aluno3.professor = "Carlos Alberto";
        aluno3.materia = "Matemática";
        aluno3.unidadeEscolar = "SESI";
        aluno3.exibirDados();

        System.out.println("---------------");

        // Professores
        Professor professor1 = new Professor();
        professor1.nome = "Carlos Alberto";
        professor1.materia = "Matemática";
        professor1.unidadeEscolar = "SESI";
        professor1.exibirDados();

        Professor professor2 = new Professor();
        professor2.nome = "Amanda";
        professor2.materia = "Portugues";
        professor2.unidadeEscolar = "SESI";
        professor2.exibirDados();

        Professor professor3 = new Professor();
        professor3.nome = "Pedro";
        professor3.materia = "Inglês";
        professor3.unidadeEscolar = "SESI";
        professor3.exibirDados();
        System.out.println("------------------------------------------------------------");


        Medico medico1 = new Medico();
        medico1.nome = "Carlos Eduardo Pereira";
        medico1.especialidade = "Cirurgião Vascular";
        medico1.UBS = "UBS Pae Cará";
        medico1.endereço = "Rua: São João 26 - Pae Cará";
        medico1.exibirDados();

        Medico medico2 = new Medico();
        medico2.nome = "Fred Kenji";
        medico2.especialidade = "Pneumologista";
        medico2.UBS = "UBS Vila Alice";
        medico2.endereço = "Rua: São Paulo n. 26 - Vila Alice";
        medico2.exibirDados();

        Medico medico3 = new Medico();
        medico3.nome = "Letícia";
        medico3.especialidade = "Hematologista";
        medico3.UBS = "UBS Vila Júlia";
        medico3.endereço = "Rua: Mario Fernandes n. 37 - Vila Júlia";
        medico3.exibirDados();

        System.out.println("----------------------------------------------------");

        Paciente paciente1 = new Paciente();

        paciente1.nome = " Jose Almeida";
        paciente1.idade =  54;
        paciente1.endereco = " Rua do Café 35 - Vila Júlia";
        paciente1.medico = "Leticia Medeiros";
        paciente1.comorbidade = " Trombofilia";
        paciente1.tratamento = " Medicamento Xarelto 20mg";
        paciente1.exibirDados();

        Paciente paciente2 = new Paciente();
        paciente2.nome = " Maria da Silva";
        paciente2.idade = 63;
        paciente2.endereco = " Avendida das Acácias 21 - Santo Antônio";
        paciente2.medico = "Fred Kenji";
        paciente2.comorbidade = " Enfisema Pulmonar";
        paciente2.tratamento = " Clenil Spray 200mg + terapia pulmonar";
        paciente2.exibirDados();

        Paciente paciente3 = new Paciente();
        paciente3.nome = " Pedro Victor Yanes";
        paciente3.idade =  34;
        paciente3.endereco = " Rua: Adriano de Souza n.51 - Vila Aurea";
        paciente1.medico = "Carlos Eduardo Pereira";
        paciente3.comorbidade = " Trombose Venosa Profunda";
        paciente3.tratamento = " Xarelto 20 mg ao dia + meia de compressã0";
        paciente3.exibirDados();

        Paciente paciente4 = new Paciente();
        paciente4.nome = " Maria Antonia Contin";
        paciente4.idade =  59;
        paciente4.endereco =  "Rua Japão n.44 - Centro";
        paciente4.comorbidade = "Insuficiência Circulatória";
        paciente4.tratamento = "Caminhada, dieta e meia de compressão";
        paciente4.exibirDados();


    }
}