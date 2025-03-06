package com.senai.aula01_introducao_poo.exercicio.gerenciamento_de_aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gabi", 21, 9);
        Aluno aluno2 = new Aluno("Ysa", 13, 5);
        Aluno aluno3 = new Aluno("Naty", 9, 10);

        System.out.println("Informações dos alunos: ");
aluno1.exibirInformacoes();
        System.out.println("Aprovado (a) " +aluno1.verificarAprovacao());

        aluno2.exibirInformacoes();
        System.out.println("Aprovado (a) " +aluno2.verificarAprovacao());

        aluno3.exibirInformacoes();
        System.out.println("Aprovado (a) " +aluno3.verificarAprovacao());

        aluno2.atualizarNota(9);

        System.out.println("Informações do " +aluno2+ " após atualização: ");
        aluno2.exibirInformacoes();
        System.out.println("Aprovado: " +aluno2.verificarAprovacao());
    }
}
