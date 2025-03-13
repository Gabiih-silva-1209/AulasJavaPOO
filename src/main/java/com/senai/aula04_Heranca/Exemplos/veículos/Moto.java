package com.senai.aula04_Heranca.Exemplos.veículos;

public class Moto extends Veiculos {
    private boolean temPartidaEletrica;

    public Moto(String marca, int ano, boolean temPartidaEletrica) {
        super(marca, ano);
        this.temPartidaEletrica = temPartidaEletrica;

    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Partida Elétrica: "+(temPartidaEletrica?" Sim" : " Não"));
    }
}
