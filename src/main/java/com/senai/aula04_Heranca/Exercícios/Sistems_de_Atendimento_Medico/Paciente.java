package com.senai.aula04_Heranca.Exercícios.Sistems_de_Atendimento_Medico;

public class Paciente {
    protected String nome;
    protected int idade;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;

    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
    void exibirDetalhes(){
        System.out.println("O paciente é: " +getNome()+ "Tem " +getIdade()+ "de idade ");
    }
}
