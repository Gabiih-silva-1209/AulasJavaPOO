package com.senai.aula05_Polinorfismo.Exercicios.Gestao_de_Produtos;

public class ProdutoDigital extends Produto {
    public ProdutoDigital(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return super.calcularPrecoFinal()*1.05;
    }
}

