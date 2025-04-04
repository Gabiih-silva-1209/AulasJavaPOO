package com.senai.aula06_Abstracao.Exemplos.Classe_abstrata.Animal;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(" Au au au");
    }
}
