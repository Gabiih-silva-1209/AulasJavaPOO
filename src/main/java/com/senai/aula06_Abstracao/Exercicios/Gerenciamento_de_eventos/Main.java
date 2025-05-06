package com.senai.aula06_Abstracao.Exercicios.Gerenciamento_de_eventos;

public class Main {
    public static void main(String[] args) {
        Evento social = new EventoSocial("Confraternização", 90);
        Evento competicao = new Competicao("Torneio de Xadrez", 120);
        Evento desafio = new DesafioRelampago("Quiz Rápido");

        System.out.println("=== Evento Social ===");
        social.gerenciarEvento();

        System.out.println("\n=== Competição ===");
        competicao.gerenciarEvento();

        System.out.println("\n=== Desafio Relâmpago ===");
        desafio.gerenciarEvento();
    }
}

