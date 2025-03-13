package com.senai.aula04_Heranca.Exemplos.gerenciamento_de_banco_bancarias;

public class ContaPoupanca extends exercício05Encapsulamento02.ContaBancaria {
    private double taxaDeRendimento;

    public ContaPoupanca(String titular, double saldoInicial, double taxaDeRendimento) {
        super(titular, saldoInicial);
        this.taxaDeRendimento = taxaDeRendimento;
    }
    public void aplicarRendimento(){
        saldo+= (saldo*taxaDeRendimento)/100;
    }
}
