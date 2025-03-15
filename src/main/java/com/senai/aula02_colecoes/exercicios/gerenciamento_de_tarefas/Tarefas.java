package com.senai.aula02_colecoes.exercicios.gerenciamento_de_tarefas;

public class Tarefas {
        private String nome;
        private boolean concluida;

        public Tarefas(String nome) {
            this.nome = nome;
            this.concluida = false;
        }

        public String getNome() {
            return nome;
        }

        public boolean isConcluida() {
            return concluida;
        }

        public void setConcluida(boolean concluida) {
            this.concluida = concluida;
        }
    }
