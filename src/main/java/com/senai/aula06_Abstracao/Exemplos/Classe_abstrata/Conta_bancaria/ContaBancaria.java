package com.senai.aula06_Abstracao.Exemplos.Classe_abstrata.Conta_bancaria;

public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inicial inválido. O saldo inicial não pode ser negativo.");
        }
    }

    abstract void aplicarTaxaMensal();

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido,o valor precisa ser maior que zero!!");
        }
    }

    public boolean sacar(double valor) {
        if (valor <= saldo && valor < 0) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso na conta do titular " + titular + "! saldo atual de R$ " + saldo);
            return true;
        } else {
            System.out.println("Saldo insulficiente!!");
            return false;
        }
    }

    public void exibirSaldo() {
        System.out.printf("Nome: %s, Salário: R$ %.2f \n", titular, saldo);
    }
}
