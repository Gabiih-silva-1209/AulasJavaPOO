package com.senai.aula06_Abstracao.Exercicios.Sistema_padronizado_de_check_in;

import com.senai.aula06_Abstracao.Exemplos_Interface.Aparelho_Inteligente.AparelhoInteligente;
import com.senai.aula06_Abstracao.Exemplos_Interface.Aparelho_Inteligente.LampadaInteligente;
import com.senai.aula06_Abstracao.Exemplos_Interface.Aparelho_Inteligente.TVSmart;

public class Main {
    public static void main(String[] args) {
CheckIn.MensagemBemVindo(new Gol());
        CheckIn.MensagemBemVindo(new Latam());

        System.out.println("------ Testando o check-In da companhia Gol");
        CheckIn.MensagemBemVindo();

    }
}
