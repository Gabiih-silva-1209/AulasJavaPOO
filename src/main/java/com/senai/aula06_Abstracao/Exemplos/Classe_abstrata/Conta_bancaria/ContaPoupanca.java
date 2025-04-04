package com.senai.aula06_Abstracao.Exemplos.Classe_abstrata.Conta_bancaria;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxaMensal() {
        saldo+=saldo*0.05;
    }
}
