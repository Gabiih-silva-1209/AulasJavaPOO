package com.senai.aula04_Heranca.Exercícios.Sistems_de_Atendimento_Medico;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--------- Teste 1 -------------\n");
        PacienteConvenio pacienteConvenio01 = new PacienteConvenio("Bianca", 19, 50);
        PacienteParticular pacienteParticular01 = new PacienteParticular("Jamilly", 20, 150);

        pacienteConvenio01.exibirDetalhes();
        pacienteParticular01.exibirDetalhes();

        System.out.println("\n--------- Teste 2: -------------\n");

        PacienteConvenio pacienteConvenio02 = new PacienteConvenio("Amanda", 19, -100);
        PacienteParticular pacienteParticular02 = new PacienteParticular("Sabrina", 21,-180);

        pacienteConvenio02.exibirDetalhes();
        pacienteParticular02.exibirDetalhes();

    }
}
