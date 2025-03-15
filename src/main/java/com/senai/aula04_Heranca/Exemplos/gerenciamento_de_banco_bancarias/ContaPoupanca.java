package com.senai.aula04_Heranca.Exemplos.gerenciamento_de_banco_bancarias;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeRendimento;

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public ContaPoupanca(String titular, double saldoInicial, double taxaDeRendimento) {
        super(titular, saldoInicial);
        this.taxaDeRendimento = taxaDeRendimento;


    }

    public void aplicarRendimento() {

        saldo += (saldo * taxaDeRendimento) / 100;
        System.out.println("Rendimento aplicado! Novo saldo: R$ " + saldo);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "titular='" + getTitular() + '\'' +
                ", saldo=" + saldo +
                ", taxaDeRendimento=" + taxaDeRendimento +
                '}';
    }
}
