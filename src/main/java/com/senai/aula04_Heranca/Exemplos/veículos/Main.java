package com.senai.aula04_Heranca.Exemplos.veículos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("HB20", 2025, 4);
        Moto moto = new Moto("Honda", 2025,true);

        carro.exibirDetalhes();
        moto.exibirDetalhes();
    }
}
