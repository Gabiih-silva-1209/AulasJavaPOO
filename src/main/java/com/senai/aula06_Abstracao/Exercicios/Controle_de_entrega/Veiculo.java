package com.senai.aula06_Abstracao.Exercicios.Controle_de_entrega;

public abstract class Veiculo {
    protected double velocidadeAtual; // km/h
    protected double capacidadeMaxCarga; // kg
    protected double distanciaDestino; // km

    public Veiculo(double capacidadeMaxCarga, double distanciaDestino) {
        this.velocidadeAtual = 0;
        this.capacidadeMaxCarga = capacidadeMaxCarga;
        this.distanciaDestino = distanciaDestino;
    }

    public void aumentarVelocidade(double incremento) {
        this.velocidadeAtual += incremento;
        System.out.printf("Velocidade aumentada para %.1f km/h\n", velocidadeAtual);
    }

    public void exibirDetalhes() {
        System.out.printf("Velocidade atual: %.1f km/h\n", velocidadeAtual);
        System.out.printf("Capacidade máxima de carga: %.1f kg\n", capacidadeMaxCarga);
        System.out.printf("Distância até o destino: %.1f km\n", distanciaDestino);
    }

    public abstract double calcularTempoEntrega();
}

