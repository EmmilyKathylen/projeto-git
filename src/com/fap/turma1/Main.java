package com.fap.turma1;

public class Main {
    public static void main(String[] args) {
        CadastroAluno aluno1 = new CadastroAluno();
        aluno1.nome = "Emmi";
        aluno1.email = "Emmisou@gmail.com.br";
        aluno1.idade = 23;
        aluno1.mensalidade = 600;
        aluno1.desconto = 150;


        aluno1.mensagemSistema();
        aluno1.exibirCurso("Teste de Software");

        double valorFinal = aluno1.calcularValorFinal();
        System.out.println(valorFinal);

        double media = aluno1.calcularNotas(8, 7.3, 6);
        System.out.printf("Média: %.1f", media);

        aluno1.verificarAprovacao(media);


    }
}
