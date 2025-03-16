package com.senai.aula04_Heranca.Exercícios.controle_de_estoque;

public class Main {
    public static void main(String[] args) {

        Alimento alimento = new Alimento(   "Feijão",
                                            19,
                                            50,
                                            "29/10/2025");


        Eletronico eletronico = new Eletronico( "Notebook",
                                                3250,
                                                20,
                                                220);

        System.out.println(" ----------------- Teste 1 --------------------\n");
    alimento.exibirDetalhes();
    eletronico.exibirDetalhes();

        System.out.println("----------------- Teste 2 -------------------------\n");
        Alimento alimento2 = new Alimento(      "Arroz " ,
                                                -10,
                                                -51,
                                                "01/01/2024");


        System.out.println("------------------ Teste 3 -------------------\n");
        Eletronico eletronico2 = new Eletronico("Tv",
                                                -1500,
                                                -10,
                                                125);


        System.out.println("---------------- Teste 4 ------------------------\n");
Eletronico eletronico3 = new Eletronico("Geladeira",
                                        4800,
                                        30,
                                        150);

        System.out.println("---------------- Teste 5 - Voltagem ------------------------\n");
        eletronico.setVoltagem(110);
        System.out.println("A voltagem foi configurada para: " +eletronico.getVoltagem());

        eletronico.setVoltagem(220);
        System.out.println("A voltagem foi configurada para: " +eletronico.getVoltagem());

        eletronico.setVoltagem(150);
        System.out.println("A voltagem foi configurada para: " +eletronico.getVoltagem());

    }
}
