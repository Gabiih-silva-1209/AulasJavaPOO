package com.senai.aula06_Abstracao.Exemplos_Interface.Aparelho_Inteligente_slide;

public class Main {
    public static void main(String[] args) {
        testarAparelhoInteligente(new LampadaInteligente(-2));
        testarAparelhoInteligente(new TVSmart(2));
    }

    public static void testarAparelhoInteligente(AparelhosInteligente aparelhosInteligente) {
        System.out.println("---- Testando aparelhos --------");
        aparelhosInteligente.ligar();
        aparelhosInteligente.desligar();
    }
}
