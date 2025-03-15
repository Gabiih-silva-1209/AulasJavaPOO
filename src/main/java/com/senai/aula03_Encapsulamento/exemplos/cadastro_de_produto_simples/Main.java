package com.senai.aula03_Encapsulamento.exemplos.cadastro_de_produto_simples;

import com.senai.aula03_Encapsulamento.exemplos.cadastro_de_produto_simples.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Feijão", 10);
        Produto produto2 = new Produto ("Arroz", 20);

        System.out.println("----------");
        System.out.println(produto1);
        System.out.println(produto2);

        produto1.setPreco(10);
        produto2.setPreco(-30);

        //Atualizando os preços dos produtos

        System.out.println("------------ Após atualização ---------------------");
        System.out.println(produto1);
        System.out.println(produto2);


    }
}
