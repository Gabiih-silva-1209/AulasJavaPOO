package com.senai.aula06_Abstracao.Exemplos.Classe_abstrata.Animal;

public class Pato extends Animal{
    public Pato(String nome) {
        super(nome);
    }
    @Override
    public void fazerSom() {
        System.out.println(" Quac quac ");
    }
    void botarOvo(){
        System.out.println(nome+ " virou mamãe!!!");
    }
}
