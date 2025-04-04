package com.senai.aula06_Abstracao.Exemplos_Interface.Smartwatch;

public class Smartwatch implements SensorSono,SensorCardioco,SensorPassos {

    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Medição cardiáca: 80 bpm");
    }

    @Override
    public void contarPassos() {
        System.out.println("Passos hoje: 10000 passos");
    }

    @Override
    public void medirQualidadeDeSono() {
        System.out.println("Qualidade do sono: 7:30 sono profundo");
    }
    public void exibirInfoDispositivos(){
        System.out.println("Dispositivos conectados: ....");
    }
}
