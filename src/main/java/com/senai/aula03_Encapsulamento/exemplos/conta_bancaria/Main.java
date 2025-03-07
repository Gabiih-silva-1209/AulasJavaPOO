package com.senai.aula03_Encapsulamento.exemplos.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("Gabrieli", -100);
        ContaBancaria contaBancaria2 = new ContaBancaria("Ysabelly", 10000);

        System.out.println(contaBancaria1);
        System.out.println(contaBancaria2);

        System.out.println("-----teste depositar------");
        contaBancaria1.depositar(100);
        contaBancaria2.depositar(-1000);

        System.out.println("------teste sacar----------");
        contaBancaria1.sacar(1500);
        contaBancaria2.sacar(50);

        System.out.println(contaBancaria1);
        System.out.println(contaBancaria2);

        System.out.println("--------Teste transferência-----------");
        contaBancaria2.transferir(1000,contaBancaria1);
    }
}
