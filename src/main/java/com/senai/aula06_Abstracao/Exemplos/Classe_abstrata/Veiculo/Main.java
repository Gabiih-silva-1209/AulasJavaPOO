package com.senai.aula06_Abstracao.Exemplos.Classe_abstrata.Veiculo;

public class Main {
    public static void main(String[] args) {
testarVeiculo(new Carro());
testarVeiculo(new Moto());
    }
    private static void testarVeiculo(Veiculo veiculo){
veiculo.ligar();
veiculo.acelerar(10);
veiculo.acelerar(20);
    }
}
