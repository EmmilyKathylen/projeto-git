package com.fap.turma1;

public class Main {
    public static void main(String[] args) {
        CadastroAluno aluno1 = new CadastroAluno();
        aluno1.nome = "Emmi";
        aluno1.email = "Emmi.com.br";
        aluno1.idade = 23;

        CadastroAluno aluno2 = new CadastroAluno();
        aluno2.nome = "Julia";
        aluno2.email = "Julia.com.br";
        aluno2.idade = 18;

        aluno1.listarInformacoesAluno();
    }
}
