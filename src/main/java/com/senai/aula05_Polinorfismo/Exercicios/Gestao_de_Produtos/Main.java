package com.senai.aula05_Polinorfismo.Exercicios.Gestao_de_Produtos;

public class Main {
    public static void main(String[] args) {
        Produto produtoFisico  = new ProdutoFisico("Livro", 50.05);
        Produto produtoDigital = new ProdutoDigital("E-book", 30.50);
        Produto produtoServico = new ProdutoServico("Consultoria", 250);

        System.out.println("O preço final do produto físico: " +produtoFisico.calcularPrecoFinal());
        System.out.println("O preço final do produto digital: " +produtoDigital.calcularPrecoFinal());
        System.out.println("O preço final do produto serviço: " +produtoServico.calcularPrecoFinal());

    }
}
