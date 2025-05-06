package com.senai.aula06_Abstracao.Exercicios.Sistema_padronizado_de_check_in;

public interface CheckIn {
    void validarDocumento(String cpf, String rg);
    void emitirCartaoDeEmbarque();
    static void mensagemPadrao() {
        System.out.println("Check-in seguro realizado pelo FlySecure.");
    }
    static void mensagemBoasVindas() {
        System.out.println("Bem-vindo ao sistema FlySecure!\n");
    }
    int PESO_MAX_NACIONAL = 23; // kg
    int PESO_MAX_INTERNACIONAL = 32; // kg
}

