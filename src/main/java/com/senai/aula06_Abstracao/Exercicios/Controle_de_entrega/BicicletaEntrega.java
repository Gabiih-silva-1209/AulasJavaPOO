package com.senai.aula06_Abstracao.Exercicios.Controle_de_entrega;

public class BicicletaEntrega extends Veiculo {

    public BicicletaEntrega(double capacidadeMaxCarga, double distanciaDestino) {
        super(capacidadeMaxCarga, distanciaDestino);
        this.velocidadeAtual = 20;
    }

    @Override
    public double calcularTempoEntrega() {
        return distanciaDestino / velocidadeAtual;
    }
}
