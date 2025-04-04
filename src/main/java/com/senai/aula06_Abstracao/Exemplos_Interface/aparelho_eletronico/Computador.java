package com.senai.aula06_Abstracao.Exemplos_Interface.aparelho_eletronico;

public class Computador implements AparelhoEletronico{
    @Override
    public void ligar() {
        System.out.println("Computador ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligado");
    }
}
