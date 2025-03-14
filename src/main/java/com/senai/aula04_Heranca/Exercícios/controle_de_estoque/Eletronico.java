package com.senai.aula04_Heranca.Exercícios.controle_de_estoque;

public class Eletronico extends Produto{
    protected int voltagem;

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public Eletronico(String name, double preco, int quantidade, int voltagem) {
        super(name, preco, quantidade);
        this.voltagem = voltagem;


    }
}
