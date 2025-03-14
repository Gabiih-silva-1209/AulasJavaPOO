package com.senai.aula04_Heranca.Exercícios.sistema_de_funcionarios;

import java.util.List;

public class Coordernador extends Funcionario {
    protected List<Professor> equipe;

    public List<Professor> getEquipe() {
        return equipe;
    }

    public void setEquipe(List<Professor> equipe) {
        this.equipe = equipe;
    }

    public Coordernador(String name, double salario, List<Professor> equipe) {
        super(name, salario);
        this.equipe = equipe;


    }
}
