package com.senai.aula04_Heranca.Exercícios.Sistems_de_Atendimento_Medico;

public class PacienteParticular extends Paciente {
    protected double custoConsulta;

    public PacienteParticular(String nome, int idade, double custoConsulta) {
        super(nome, idade);
            if (custoConsulta >= 0) {
                this.custoConsulta = custoConsulta;
            } else {
                System.out.println("O custo da consulta não pode ser negativo!");
                this.custoConsulta = 0;
        }
    }

    public double getCustoConsulta() {

        return custoConsulta;
    }

    public void setCustoConsulta(double custoConsulta) {

        this.custoConsulta = custoConsulta;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(" O custo da consulta é: " +getCustoConsulta());
    }
}
