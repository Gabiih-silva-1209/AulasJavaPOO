package com.senai.aula01_introducao_poo.exemplos.pessoa;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

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

        System.out.println(pessoa1.endereco.rua);
        System.out.println(pessoa2.endereco.rua);

        pessoa1.falar("Hello, how are you today? What's up??");
        pessoa2.falar("I'm so good, not bed");

        pessoa1.comer(" Strogonoff");
        pessoa2.comer("Churros");
        pessoa1.falar("Very good, have a good day!!");
        pessoa2.comer("Bolo de chocolate");

        Scanner scanner = new Scanner(System.in);
        String[] etiquetas = {"Nome: ", "Idade: ", "Altura: ", "Endereço: \n\trua:",
                "\tnúmero: ", "\tbairro:", "\t cidade: ", "\t estado: ", "\t país"};
        String[] dados = new String[etiquetas.length];
        for (int i = 0; i < etiquetas.length; i++) {
            System.out.print(etiquetas[i]);
            dados[i] = scanner.nextLine();
        }

        System.out.println("Preencha as informações a seguir: ");
        Pessoa pessoa3 = new Pessoa(
                dados[0],
                Integer.parseInt(dados[1]),
                Float.parseFloat(dados[2]),
                new Endereco(
                        dados[3],
                        Integer.parseInt(dados[4]),
                        dados[5],
                        dados[6],
                        dados[7],
                        dados[8]
                )
        );

    }
}
