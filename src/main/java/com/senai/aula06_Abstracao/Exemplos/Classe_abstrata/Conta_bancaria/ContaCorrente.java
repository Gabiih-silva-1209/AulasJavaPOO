package com.senai.aula06_Abstracao.Exemplos.Classe_abstrata.Conta_bancaria;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxaMensal() {
        saldo-=20;

    }
}
