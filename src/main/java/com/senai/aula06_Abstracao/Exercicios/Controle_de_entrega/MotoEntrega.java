package com.senai.aula06_Abstracao.Exercicios.Controle_de_entrega;

public class MotoEntrega extends Veiculo {

    public MotoEntrega(double capacidadeMaxCarga, double distanciaDestino) {
        super(capacidadeMaxCarga, distanciaDestino);
        this.velocidadeAtual = 60; // velocidade padrão de uma moto
    }

    @Override
    public double calcularTempoEntrega() {
        return distanciaDestino / velocidadeAtual;
    }
}

