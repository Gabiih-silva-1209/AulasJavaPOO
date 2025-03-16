package com.senai.aula04_Heranca.Exercícios.Sistems_de_Atendimento_Medico;

public class PacienteConvenio extends Paciente{
    protected double desconto;

    public PacienteConvenio(String nome, int idade, double desconto) {
        super(nome, idade);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public double calcularCustoComDesconto (double custoConsulta){
        return custoConsulta - (custoConsulta *desconto);
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(" , o valor da consulta com desconto é  R$ : " +calcularCustoComDesconto(getDesconto()));
    }
}
