package com.senai.aula03_Encapsulamento.exemplos.cadastro_de_produto_simples.conta_bancaria;

public class ContaBancaria {
    private String titular;
    private  double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        if (saldo>=0) {
            this.saldo = saldo;
        }else{
            System.out.println("O saldo inicial não pode ser negativo!!");
            System.out.println("O saldo da conta iniciará com R$0,00");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor) {
    if (valor>0){
        saldo+=valor;
    }else {
        System.out.println("Valor inválido,o valor precisa ser maior que zero!!");
    }
    }

        public void sacar(double valor){
            if (valor<=saldo){
                saldo -=valor;
            }else{
                System.out.println("Saldo insulficiente!!");
            }
    }
}
