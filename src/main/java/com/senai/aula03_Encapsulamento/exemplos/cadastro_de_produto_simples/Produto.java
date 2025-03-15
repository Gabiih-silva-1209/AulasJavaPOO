package com.senai.aula03_Encapsulamento.exemplos.cadastro_de_produto_simples;

import java.util.Objects;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        if (preco >= 0) {
            this.preco = preco;
        }else{
            System.out.println("O preço do produto não pode ser negativo!!!");
            System.out.println("O preço do produto será atribuido como R$0,00!!!");
            this.preco = 0;
        }
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Produto.java{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0 && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }else{
            System.out.println("O preço do produto não pode ser negativo!!!");
            System.out.println("O preço do produto será atribuido como R$0,00!!!");
            this.preco = 0;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;


    }
}