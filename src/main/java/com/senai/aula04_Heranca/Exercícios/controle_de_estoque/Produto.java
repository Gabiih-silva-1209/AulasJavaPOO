package com.senai.aula04_Heranca.Exercícios.controle_de_estoque;

public class Produto {
    protected String name;
    protected double preco;
    protected int quantidade;

    //Construtor
    public Produto(String name, double preco, int quantidade) {
        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }


    //Método comum entre alimento e eletrônico

        void exibirDetalhes() {
            System.out.println("O produto é: " +getName()+ "seu preço é: " +getPreco()+ "há " +getQuantidade()+ "no estoque ");
        }
    }