package com.senai.aula06_Abstracao.Exemplos_Interface.Aparelho_eletronico_slide;

public class Televisao implements AparelhoEletronico{

    @Override
    public void ligar() {
        System.out.println("Televisão ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("Televisão desligada!");

    }
}
