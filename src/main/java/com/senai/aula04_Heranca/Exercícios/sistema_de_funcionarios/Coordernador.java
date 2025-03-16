package com.senai.aula04_Heranca.Exercícios.sistema_de_funcionarios;

import java.util.List;

public class Coordernador extends Funcionario {
    protected List<Professor> equipe;

    public Coordernador(String name, double salario, List<Professor> equipe) {
        super(name, salario);
        this.equipe = equipe;
    }

    public List<Professor> getEquipe() {
        return equipe;
    }

    public void setEquipe(List<Professor> equipe) {
        this.equipe = equipe;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(" , Coordernador de uma equipe com " +equipe.size() +"Professor (es)");
        for (Professor professor : equipe){
            professor.exibirDetalhes();
        }
    }
}

