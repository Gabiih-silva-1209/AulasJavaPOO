package com.senai.aula05_Polinorfismo.Exercicios.Gestao_de_Produtos;

public class ProdutoFisico extends Produto {
    public ProdutoFisico(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return super.calcularPrecoFinal()*1.1;
    }
}
