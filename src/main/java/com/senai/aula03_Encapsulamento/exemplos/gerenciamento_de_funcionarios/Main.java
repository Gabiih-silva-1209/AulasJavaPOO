package com.senai.aula03_Encapsulamento.exemplos.gerenciamento_de_funcionarios;

import com.senai.aula03_Encapsulamento.exercicios.gerenciamento_de_funcionarios.Funcionario;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- teste 01 ---------");
       Funcionarios funcionario1 = new Funcionarios("Gabrieli", 2000, 1) ;
       System.out.println(funcionario1);

        System.out.println("------- teste 02 --------");
        Funcionarios funcionario2 = new Funcionarios("Nathalia", 1000, 4);
        System.out.println(funcionario2);

        System.out.println("--------- teste 03 --------------");

        funcionario1.aumentarSalario(20);

    }
}
