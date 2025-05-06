package com.senai.aula06_Abstracao.Exercicios.Gerenciamento_de_eventos;

public class DesafioRelampago extends Evento {
    public DesafioRelampago(String nome) {
        super(nome, 10); // Tempo fixo curto
    }

    @Override
    protected void iniciarEvento() {
        System.out.println("Desafio relâmpago iniciado com tempo limitado!");
    }

    @Override
    protected void premiarParticipantes() {
        System.out.println("Dando bônus surpresa para quem completou o desafio.");
    }
}

