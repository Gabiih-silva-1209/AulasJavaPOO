package com.senai.aula04_Heranca.Exemplos.veículos;

public class Carro extends Veiculos {
    private int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(", portas: "+portas);
    }
}

