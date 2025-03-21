package com.senai.aula05_Polinorfismo.Exemplos.Animal;

public class Pato extends Animal{
    @Override
    void fazerSom() {
        System.out.println("quac quac quac");
    }

    public void voar() {
    }
}
