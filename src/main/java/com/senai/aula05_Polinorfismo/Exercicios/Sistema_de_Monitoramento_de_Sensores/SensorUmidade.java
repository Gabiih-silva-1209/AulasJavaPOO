package com.senai.aula05_Polinorfismo.Exercicios.Sistema_de_Monitoramento_de_Sensores;

public class SensorUmidade extends Sensor {
    protected double umidade;

    public SensorUmidade(double umidade) {
        this.umidade = umidade;
    }
    @Override
    public void reportarValor(){
        System.out.println("A umidade:  " +umidade+ " %");
    }
}
