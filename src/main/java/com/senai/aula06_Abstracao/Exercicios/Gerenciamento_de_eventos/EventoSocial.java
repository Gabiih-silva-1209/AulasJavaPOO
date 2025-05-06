package com.senai.aula06_Abstracao.Exercicios.Gerenciamento_de_eventos;

public class EventoSocial extends Evento {
    public EventoSocial(String nome, int duracao) {
        super(nome, duracao);
    }

    @Override
    protected void premiarParticipantes() {
        System.out.println("Distribuindo brindes simbólicos no evento social.");
    }
}

