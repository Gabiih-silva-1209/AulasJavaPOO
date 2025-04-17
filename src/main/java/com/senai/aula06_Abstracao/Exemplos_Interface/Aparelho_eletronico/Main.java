package com.senai.aula06_Abstracao.Exemplos_Interface.Aparelho_eletronico;

public class Main {
    public static void main(String[] args) {
        testarAparelho(new Televisao());
        testarAparelho(new Computador());
    }

    public static void testarAparelho(AparelhoEletronico aparelhoEletronico) {
        System.out.println("---- Testando aparelhos --------");
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}

