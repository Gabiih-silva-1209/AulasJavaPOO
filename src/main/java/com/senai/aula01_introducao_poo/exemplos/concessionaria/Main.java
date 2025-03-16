package com.senai.aula01_introducao_poo.exemplos.concessionaria;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(
                "Hyundai",
                "HB20 Sense",
                2025,
                "ABC-1234",
                "Prata",
                0,
                100000
        );

        Carro carro2 = new Carro(
          "Toyota",
          "Corolla XEi",
          2024,
          "GHI-9012",
          "Preto",
          177,
          120000
        );

        Carro carro3 = new Carro(
          "Fiat",
          "Uno Vivace",
          2023,
          "DEF-5678",
          "Vermelho",
          150,
          75000
        );

        System.out.println(carro1);
        carro1.testeDriver();
        carro1.comprar("Gabi ");

        System.out.println(carro2);
        carro2.testeDriver();
        carro2.comprar("Ysa ");

        System.out.println(carro3);
        carro3.testeDriver();
        carro3.comprar("Naty ");

        carro1.valorTabelaFipe(2025);
        carro2.valorTabelaFipe(2025);
        carro3.valorTabelaFipe(2025);
    }
}
