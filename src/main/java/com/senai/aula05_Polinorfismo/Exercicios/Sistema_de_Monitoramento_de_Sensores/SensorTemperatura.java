package com.senai.aula05_Polinorfismo.Exercicios.Sistema_de_Monitoramento_de_Sensores;

public class SensorTemperatura extends Sensor {
    protected double temperatura;

    public SensorTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
@Override
    public void reportarValor(){
    System.out.println("A temperatura: " +temperatura+ " ºC");
}

}
