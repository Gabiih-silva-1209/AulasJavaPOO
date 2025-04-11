package com.senai.aula06_Abstracao.Exercicios.Controle_de_entrega;

public abstract class Veiculo {
    protected int VelocidadeAtual;
    protected int CapacidadeMaximaDeCarga;

    public Veiculo(int velocidadeAtual, int capacidadeMaximaDeCarga) {
        VelocidadeAtual = 0;
        CapacidadeMaximaDeCarga = capacidadeMaximaDeCarga;
    }

    public void verificarVelocidadeAtual() {
        System.out.println("A velocidade atual é: " + VelocidadeAtual + "Km/h");
    }

    public void calcularADistancia(int horas) {
        int distancia = VelocidadeAtual * horas;
        System.out.println("A distância percorrida foi de: " + distancia + "Km");
    }

    public abstract void acelerar(int aumentar);

    public abstract void reduzirVelocidade(int diminuir);
}

