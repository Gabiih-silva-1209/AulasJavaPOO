package com.senai.aula06_Abstracao.Exercicios.Sistema_padronizado_de_check_in;

public class Main {
    public static void main(String[] args) {
        CheckIn.mensagemBoasVindas();

        testarCompanhia(new Gol());
        System.out.println();
        testarCompanhia(new Latam());
    }

    public static void testarCompanhia(CheckIn companhia) {
        companhia.validarDocumento("123.456.789-00", "12.345.678-9");
        companhia.emitirCartaoDeEmbarque();
        CheckIn.mensagemPadrao();
        System.out.printf("Peso máximo de bagagem (nacional): %d kg\n", CheckIn.PESO_MAX_NACIONAL);
        System.out.printf("Peso máximo de bagagem (internacional): %d kg\n", CheckIn.PESO_MAX_INTERNACIONAL);
    }
}
