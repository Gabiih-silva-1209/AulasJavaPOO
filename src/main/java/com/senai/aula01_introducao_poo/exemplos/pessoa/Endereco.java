package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Endereco {
    String rua;
    int numero;
    String bairro;
    String cidade;
    String estado;
    String pais;

    public Endereco(String rua, int numero, String bairro, String cidade, String estado, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "rua " + rua + ", " + numero + ", " + bairro + ", " + cidade + "- " + estado + ", " + pais + ".";

    }
}
