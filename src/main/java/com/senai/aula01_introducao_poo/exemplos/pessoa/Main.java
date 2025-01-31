package com.senai.aula01_introducao_poo.exemplos.pessoa;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa(
                "Gabi",
                22,
                1.6f,
                new Endereco(
                        "Marcos de Azevedo",
                        187,
                        "Vila Nogueira",
                        "Diadema",
                        "São Paulo",
                        "Brasil"
                )
        );
        Pessoa pessoa2 = new Pessoa(
                "Naty",
                9,
                1.2f,
                new Endereco(
                        "Ulisses Guimarães",
                        2170,
                        "Vila Nogueira",
                        "Diadema",
                        "São Paulo",
                        "Brasil"

                )
        );

        System.out.println(pessoa1.endereço.rua);
        System.out.println(pessoa2.endereço.rua);

        pessoa1.falar("Hello, how are you today? What's up??");
        pessoa2.falar("I'm so good, not bed");

        pessoa1.comer(" Strogonoff");
        pessoa2.comer("Churros");
        pessoa1.falar("Very good, have a good day!!");
        pessoa2.comer("Bolo de chocolate");


    }
}