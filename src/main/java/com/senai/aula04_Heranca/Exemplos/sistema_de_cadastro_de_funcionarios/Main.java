package com.senai.aula04_Heranca.Exemplos.sistema_de_cadastro_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Gabrieli", 1000);

        Gerente gerente = new Gerente("Nathalia", 5000, 1500);

        funcionario.exibirDados();
        gerente.exibirDados();
    }
}
