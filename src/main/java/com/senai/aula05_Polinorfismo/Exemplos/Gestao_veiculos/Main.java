package com.senai.aula05_Polinorfismo.Exemplos.Gestao_veiculos;

public class Main {
    public static void main(String[] args) {

        realizarManutencao(new Carro("City"));
        realizarManutencao(new Moto("Factor"));
        realizarManutencao(new Caminhao("Scania 1659"));
    }
    private static void realizarManutencao(Veiculo veiculo){

        veiculo.realizarManutencao();
    }
}
