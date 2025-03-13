package com.senai.aula04_Heranca.Exemplos.gerenciamento_de_banco_bancarias;

public class ContaCorrente extends exercício05Encapsulamento02.ContaBancaria {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

    public ContaCorrente(String titular, double saldoInicial, double limite) {
        super(titular, saldoInicial);
        this.limite = limite;


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
}
