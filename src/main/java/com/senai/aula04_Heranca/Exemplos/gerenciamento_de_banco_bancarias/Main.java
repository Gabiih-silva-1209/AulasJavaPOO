package com.senai.aula04_Heranca.Exemplos.gerenciamento_de_banco_bancarias;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Gabrieli", 5000,50000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Nathalia", 6000, 8000);

        contaCorrente.exibirSaldo();
        contaPoupanca.exibirSaldo();

        System.out.println("---------Teste CC-----------");
        contaCorrente.sacar(6000);
        contaCorrente.sacar(200);
contaCorrente.sacar(5900);

        System.out.println("--------- Teste CP ----------------");
        contaPoupanca.aplicarRendimento();

        System.out.println("-----------------------------");
        contaCorrente.exibirSaldo();
        contaPoupanca.exibirSaldo();
    }
}
