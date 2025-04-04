package com.senai.aula06_Abstracao.Exemplos.Classe_abstrata.Veiculo;

public abstract class Veiculo {
    private int velocidade;

    public Veiculo() {
        this.velocidade = 0;
    }
    public void acelerar(int incremento){
        velocidade+=incremento;
        System.out.println("Vrummmm, acelerando para " +velocidade+ "Km/h");
    }
    abstract void ligar();
}
