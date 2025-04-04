package com.senai.aula06_Abstracao.Exemplos_Interface.Veiculo;

public class Carro implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("Carro Acelerando");
    }
}
