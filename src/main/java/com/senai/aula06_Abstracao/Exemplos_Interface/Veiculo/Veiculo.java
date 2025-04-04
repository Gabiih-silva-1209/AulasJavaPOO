package com.senai.aula06_Abstracao.Exemplos_Interface.Veiculo;

public interface Veiculo {
    void acelerar();

    default void buzinar(){
        System.out.println("BIII BIII");
    }
}
