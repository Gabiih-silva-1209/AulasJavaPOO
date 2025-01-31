package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Pessoa {
    String name;
    int idade;
    float altura;
    Endereco endereço;

    public Pessoa(String name, int idade, float altura, Endereco endereço) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
        this.endereço = endereço;
    }

    public Pessoa(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public void falar(String frase) {
        System.out.println(name+ " falou: " +frase);
    }

    public void comer(String alimento) {
        System.out.println(name+ " comeu:" + alimento);
    }


    @Override
    public String toString() {
        return "O nome da pessoa é " + this.name + " tem " + this.idade + "anos," + this.altura + " de altura e mora no endereço " + this.endereço;

    }
}
