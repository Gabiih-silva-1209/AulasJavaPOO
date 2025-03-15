package com.senai.aula03_Encapsulamento.exercicios.cadastro_de_produto_simples;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Vestido", 30);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: " +produto.getPreco());

        produto.setNome("Short Jeans");
        produto.setPreco(60);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: " +produto.getPreco());

        produto.setPreco(-10.0);
    }
}
