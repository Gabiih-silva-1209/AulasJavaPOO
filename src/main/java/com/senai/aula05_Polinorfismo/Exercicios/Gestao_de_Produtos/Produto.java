package com.senai.aula05_Polinorfismo.Exercicios.Gestao_de_Produtos;

public class Produto {
    protected String Nome;
    protected double PrecoBase;

    public Produto(String nome, double precoBase) {
        Nome = nome;
        PrecoBase = precoBase;
    }
    public  double calcularPrecoFinal(){
        return  PrecoBase;
    }
}
