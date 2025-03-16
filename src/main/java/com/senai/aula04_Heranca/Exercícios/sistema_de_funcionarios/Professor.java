package com.senai.aula04_Heranca.Exercícios.sistema_de_funcionarios;

public class Professor extends Funcionario {
    protected String disciplina;

    public Professor(String name, double salario, String disciplina) {
        super(name, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;

    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(" , Disciplina: " +disciplina);
    }
}

