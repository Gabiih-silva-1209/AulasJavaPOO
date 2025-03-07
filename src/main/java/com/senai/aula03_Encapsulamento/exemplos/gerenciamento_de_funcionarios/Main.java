package com.senai.aula03_Encapsulamento.exemplos.gerenciamento_de_funcionarios;

import com.senai.aula03_Encapsulamento.exercicios.gerenciamento_de_funcionarios.Funcionario;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- teste 01 ---------");
        Funcionarios = funcionario01 = new Funcionario("Gabrieli", 2000, 1);
        System.out.println(funcionario01);

        System.out.println("------- teste 02 --------");
        Funcionarios = funcionario02 = new Funcionario("Nathalia", 1000, 4);
        System.out.println(funcionario02);

        System.out.println("--------- teste 03 --------------");

        funcionario01.aumentarSalario(20);

    }
}
