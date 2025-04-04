package com.senai.aula06_Abstracao.Exemplos.Classe_abstrata.Conta_bancaria;

public class Main {
    public static void main(String[] args) {
        testarContas(new ContaCorrente("Gabrieli ", 5000));
        testarContas(new ContaPoupanca("Nathalia ", 6000));
    }
    private static void testarContas(ContaBancaria contaBancaria){
        System.out.printf("----- Testando conta do cliente: %s --------------\n", contaBancaria.titular);
        contaBancaria.exibirSaldo();
        contaBancaria.aplicarTaxaMensal();
        contaBancaria.exibirSaldo();
    }
}
