package com.senai.aula06_Abstracao.Exercicios.Sistema_padronizado_de_check_in;

public class Latam implements CheckIn {
    @Override
    public void validarDocumento(String cpf, String rg) {
        System.out.println("[LATAM] CPF: " + cpf + " e RG: " + rg + " validados com sucesso.");
    }

    @Override
    public void emitirCartaoDeEmbarque() {
        System.out.println("[LATAM] Cartão de embarque emitido com sucesso.");
    }
}

