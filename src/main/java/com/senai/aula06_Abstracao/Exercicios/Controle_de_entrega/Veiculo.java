package com.senai.aula06_Abstracao.Exercicios.Controle_de_entrega;

public abstract class Veiculo {
    protected int VelocidadeAtual;
    protected int CapacidadeMaximaDeCarga;
    protected int distanciaPercorrida;

    public Veiculo(int velocidadeAtual, int capacidadeMaximaDeCarga, int distanciaPercorrida) {
        VelocidadeAtual = 0;
        CapacidadeMaximaDeCarga = capacidadeMaximaDeCarga;
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public void verificarVelocidadeAtual() {
        System.out.println("A velocidade atual é: " + VelocidadeAtual + "Km/h");
    }

    public void calcularADistancia(int km) {
        distanciaPercorrida +=km;
        int distancia = VelocidadeAtual * km;
        System.out.println("A distância percorrida foi de: " + distancia + "Km");
    }
public abstract  void mostrarDetalhes();

    public abstract void acelerar(int aumentar);

    public abstract void reduzirVelocidade(int diminuir);
}

