package com.senai.aula06_Abstracao.Exemplos.Veículo;

public abstract class Veiculo {
    private int velocidade;

    public Veiculo(int velocidade) {
        this.velocidade = 0;
    }
    public void acelerar(int incremento){
        velocidade+=incremento;
        System.out.println("Vrummmm, acelerando para " +velocidade+ "Km/h");
    }
    abstract void ligar();
}
