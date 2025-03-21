package com.senai.aula05_Polinorfismo.Exemplos.Animal;

public class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Au au au");
    }
}
