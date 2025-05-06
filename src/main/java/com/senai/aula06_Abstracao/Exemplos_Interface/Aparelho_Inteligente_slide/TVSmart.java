package com.senai.aula06_Abstracao.Exemplos_Interface.Aparelho_Inteligente_slide;

public class TVSmart implements AparelhosInteligente {
    private int volume;

    public TVSmart(int volume) {
        this.volume = 0;
    }

    @Override
    public void ligar() {
        System.out.println("TV ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("Tv desligada!");
    }
    public void aumentarVolume(){
        System.out.println("Volume " +(volume=ajustarNivel(volume,1)));
    }
    public void baixarVolume(){
        System.out.println("Volume " +(volume=ajustarNivel(volume,-1)));
    }
}
