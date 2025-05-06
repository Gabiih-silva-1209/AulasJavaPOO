package com.senai.aula06_Abstracao.Exercicios.Gerenciamento_de_eventos;

public abstract class Evento {
    protected String nome;
    protected int duracao; // em minutos
    public static final int TEMPO_PADRAO = 60;
    public static final String PREMIACAO_PADRAO = "Medalha de participação";

    public Evento(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public final void gerenciarEvento() {
        validarEvento();
        iniciarEvento();
        encerrarEvento();
        premiarParticipantes();
    }

    protected void validarEvento() {
        System.out.println("Validando integridade do evento: " + nome);
    }

    protected void iniciarEvento() {
        System.out.println("Iniciando evento: " + nome);
    }

    protected void encerrarEvento() {
        System.out.println("Encerrando evento: " + nome);
    }

    protected void premiarParticipantes() {
        System.out.println("Premiando participantes com: " + PREMIACAO_PADRAO);
    }
}
