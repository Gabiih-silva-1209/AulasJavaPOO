package com.senai.aula01_introducao_poo.exercicio.cadastro_de_produto;

public class Produto {
    String Nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.Nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public void exibirDetalhes() {
        System.out.println("O nome do produto é : " +Nome+ " custa R$: " +preco+ " há " +quantidade+ " no estoque!");
    }
    public  void atualizarEstoque(int valor){
        this.quantidade +=valor;
    }

    @Override
    public String toString() {
        return "Produto.java{" +
                "Nome='" + Nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public double calcularValorEstoque(){
        return preco *quantidade;



    }
}
