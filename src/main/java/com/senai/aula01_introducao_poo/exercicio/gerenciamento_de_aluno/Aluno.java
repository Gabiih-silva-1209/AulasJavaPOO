package com.senai.aula01_introducao_poo.exercicio.gerenciamento_de_aluno;

public class Aluno {
    String Nome;
    int Idade;
    double Nota;

    public Aluno(String Nome, int Idade, double Nota) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Nota = Nota;


    }

    public void exibirInformacoes() {
        System.out.println("O nome do aluno (a) é: " + Nome + " este aluno (a) tem " + Idade + " anos de idade, sua nota é: " + Nota + ".");
    }

    public void atualizarNota(double Nota) {
        this.Nota = Nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Nome='" + Nome + '\'' +
                ", Idade=" + Idade +
                ", Nota=" + Nota +
                '}';
    }

    public boolean verificarAprovacao() {
return Nota >= 6;



    }
}
