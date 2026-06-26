package com.fap.turma1;

public class CadastroAluno {
    String nome;

    String email;

    int idade;

    double mensalidade;

    double desconto;

    void mensagemSistema() {
        System.out.println("Seja bem-vindo ao sistema:" + nome);

    }

    void  exibirCurso(String curso) {
        System.out.println("Curso: " + curso);
    }

    double calcularValorFinal() {
        return mensalidade - desconto;
    }

    double calcularNotas(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    void verificarAprovacao(double media) {
        if (media >= 7) {
            System.out.println(" Aprovado");
        }

        else {

            System.out.println(" Reprovado");
        }

    }
 }
