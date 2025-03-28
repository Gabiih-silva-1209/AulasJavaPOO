package com.senai.aula05_Polinorfismo.Exercicios.Sistema_de_Monitoramento_de_Sensores;

public class Main {
    public static void main(String[] args) {
        Sensor sensorTemperatura =  new SensorTemperatura(25.5);
        Sensor sensorUmidade = new SensorUmidade(60);

        sensorTemperatura.reportarValor();
                sensorUmidade.reportarValor();


    }
}
