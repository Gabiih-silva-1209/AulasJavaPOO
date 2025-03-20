package com.senai.aula04_Heranca.Exercícios.Sistema_de_bibliotecas;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ----------------- Teste 1 --------------------\n");

        LivroFisico livroFisico01 = new LivroFisico("Não fale com estranhos",
                                                    "Harlan Coben",
                                                    304
                                                    );

        LivroDigital livroDigital01 = new LivroDigital( "Desaparecido para sempre",
                                                        "Harlan COber",
                                                        15
                                                    );

        livroDigital01.exibirDetalhes();
        livroFisico01.exibirDetalhes();

        System.out.println(" ----------------- Teste 2 --------------------\n");

        LivroFisico livroFisico02 = new LivroFisico(    "Silêncio na floresta",
                                                        "Harlan Coben",
                                                        -352
                                                    );

        LivroDigital livroDigital02 = new LivroDigital( "O inocente",
                                                        "Harlan Coben" ,
                                                        -20
                                                    );



    }
}
