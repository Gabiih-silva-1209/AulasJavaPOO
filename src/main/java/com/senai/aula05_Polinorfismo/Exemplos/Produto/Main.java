package com.senai.aula05_Polinorfismo.Exemplos.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("arroz");
        Produto produto2 = new Produto("feijão", 10);
        Produto produto3 = new Produto("Macarrão", 4.2, 3);
        Produto produto4 = new Produto();

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);
    }
}
