package com.senai.aula06_Abstracao.Exemplos_Interface.Aparelho_Eletronico_Detalhado;


public class LampadaInteligente implements AparelhoInteligente {
    private int brilho;

    public LampadaInteligente() {
        this.brilho = 0;
    }

    @Override
    public void ligar() {
        System.out.println("Lâmpada Ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Lâmpada Desligada");
    }

    public void aumentarBrilho() {
        System.out.printf("Brilho %d\n", brilho = ajusteNivel(brilho, 1));
    }

    public void baixarBrilho() {
        System.out.printf("Brilho %d\n", brilho = ajusteNivel(brilho, -1));
    }
}

