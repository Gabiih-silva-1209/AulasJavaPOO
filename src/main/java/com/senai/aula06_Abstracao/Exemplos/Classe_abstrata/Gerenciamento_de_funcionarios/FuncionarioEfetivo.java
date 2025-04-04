package com.senai.aula06_Abstracao.Exemplos.Classe_abstrata.Gerenciamento_de_funcionarios;

public class FuncionarioEfetivo extends Funcionarios{
    protected double bonusMensal;

    public FuncionarioEfetivo(String nome, double salario, double bonusMensal) {
        super(nome, salario);
        this.bonusMensal = bonusMensal;
    }

    @Override
    public double calcularBonus() {
        return salario+=bonusMensal;
    }
}
