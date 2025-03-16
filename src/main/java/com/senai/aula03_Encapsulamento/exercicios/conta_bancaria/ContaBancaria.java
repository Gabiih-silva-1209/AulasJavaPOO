package com.senai.aula03_Encapsulamento.exercicios.conta_bancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        }else{
            System.out.println("Saldo inicial inválido. O saldo inicial não pode ser negativo.");
        }
    }
    public String getTitular(){
return titular;
}

    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + "realizado com sucesso!!");
        }else{
            System.out.println("Valor de depósito inválido. O valor  dever ser positivo");
        }
    }
public void sacar (double valor){
        if (valor > 0 && valor <=saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + "realizado com sucesso!!!");
        }else{
            System.out.println("Saque inválido. Verifique o valor ou o saldo da conta!");
        }
}
}
