package com.senai.aula06_Abstracao.Exemplos_Interface.Aparelho_Inteligente;

public class LampadaInteligente implements AparelhoInteligente{
    private int brilho;

    public LampadaInteligente(int brilho) {
        this.brilho = 0;
    }

    @Override
    public void ligar() {
        System.out.println("Lâmpada ligada!!");

    }

    @Override
    public void desligar() {
        System.out.println("Lâmpada desligada!!");

    }
    public void aumentarBrilho(){
        System.out.println("Brilho " +(brilho=ajustarNivel(brilho,1)));

    }
    public void baixarBrilho(){
        System.out.println("Brilho " +(brilho=ajustarNivel(brilho, -1)));
    }
}
