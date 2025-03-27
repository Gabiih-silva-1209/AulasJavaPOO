package com.senai.aula05_Polinorfismo.Exercicios.Sistema_de_Relatorios;

public class Main {
    public static void main(String[] args) {

        imprimindoRelatorio(new PDF());
        imprimindoRelatorio(new CSV());
        imprimindoRelatorio(new JSON());
    }
    public static void imprimindoRelatorio (Relatorio relatorio){
        relatorio.gerar();
    }
}

