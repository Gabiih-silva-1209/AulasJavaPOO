package com.senai.aula06_Abstracao.Exercicios.Sistema_padronizado_de_check_in;

public abstract class CompanhiaAerea {
    protected String nomePassageiro;
    protected String Documento;


    public CompanhiaAerea(String nomePassageiro, String documento) {
        this.nomePassageiro = nomePassageiro;
        Documento = documento;

    }
}
