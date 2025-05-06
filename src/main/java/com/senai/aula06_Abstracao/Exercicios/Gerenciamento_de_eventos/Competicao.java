package com.senai.aula06_Abstracao.Exercicios.Gerenciamento_de_eventos;

public class Competicao extends Evento {
    public Competicao(String nome, int duracao) {
        super(nome, duracao);
    }

    @Override
    protected void premiarParticipantes() {
        System.out.println("Entregando troféus e medalhas aos vencedores.");
    }
}
