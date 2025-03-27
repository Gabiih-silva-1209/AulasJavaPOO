package com.senai.aula05_Polinorfismo.Exercicios.Sistema_de_Relatorios;

public class JSON extends Relatorio {
    @Override
    public void gerar() {
        System.out.println("   Gerando relatório em JSON");
    }
}
