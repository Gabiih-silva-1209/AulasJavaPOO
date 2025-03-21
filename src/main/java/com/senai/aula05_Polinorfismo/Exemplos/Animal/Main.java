package com.senai.aula05_Polinorfismo.Exemplos.Animal;

public class Main {
    public static void main(String[] args) {
        //testarSouAnimal (new Cachorro ());
        testarSomAnimal(new Cachorro());
        testarSomAnimal(new Pato());

    }
    public static void testarSomAnimal(Animal animal){
        animal.fazerSom();
        Pato pato = (Pato) animal;
        pato.voar();

    }
}
