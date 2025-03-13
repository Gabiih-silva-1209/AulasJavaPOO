package com.senai.aula04_Heranca.Exemplos.gerenciamento_de_banco_bancarias;

public class ContaBancaria {
    private String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido,o valor precisa ser maior que zero!!");
        }
    }
    public boolean sacar(double valor){
        if (valor<=saldo&& valor<0){
            saldo -=valor;
            System.out.println("Saque realizado com sucesso na conta do titular " +titular+ "! saldo atual de R$ " +saldo);
            return true;
        }else{
            System.out.println("Saldo insulficiente!!");

        }
        return false;
    }
}
public void exibirSaldo(){
    System.out.printf("Nome: %s, Salário: R$ %.2f", get.titular, saldo());
}
