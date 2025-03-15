package com.senai.aula02_colecoes.exercicios.controle_de_estoque_de_produtos;

class Produto{
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
    public String getNome (){
        return nome;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}