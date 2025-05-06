package com.senai.aula06_Abstracao.Exercicios.Controle_de_entrega;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Entrega com Moto ---");
        Veiculo moto = new MotoEntrega(50, 120);
        moto.exibirDetalhes();
        moto.aumentarVelocidade(10);
        System.out.printf("Tempo estimado de entrega: %.2f horas\n\n", moto.calcularTempoEntrega());

        System.out.println("--- Entrega com Bicicleta ---");
        Veiculo bike = new BicicletaEntrega(20, 30);
        bike.exibirDetalhes();
        bike.aumentarVelocidade(5);
        System.out.printf("Tempo estimado de entrega: %.2f horas\n", bike.calcularTempoEntrega());
    }
}

