package com.senai.aula05_Polinorfismo.Exemplos.Gestao_veiculos;

public class Veiculo {
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void realizarManutencao(){
        System.out.println("Manutenção genérica ");
    }
}
