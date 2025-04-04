package com.senai.aula06_Abstracao.Exemplos_Interface.Smartwatch;

public class Main {
    public static void main(String[] args) {
        Smartwatch smartwatch = new Smartwatch();

        smartwatch.contarPassos();
        smartwatch.medirQualidadeDeSono();
        smartwatch.medirFrequenciaCardiaca();
        smartwatch.exibirInfoDispositivos();
    }
}
