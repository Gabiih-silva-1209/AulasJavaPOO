package com.senai.aula06_Abstracao.Exemplos.Animal;

public class Main {
    public static void main(String[] args) {
        testarAnimal(new Cachorro("Rex"));
        testarAnimal(new Pato("Alexandre"));
    }

    private static void testarAnimal(Animal animal) {
        animal.dormir();
        animal.fazerSom();
        Pato pato = (Pato) animal;
        pato.botarOvo();
    }
}
