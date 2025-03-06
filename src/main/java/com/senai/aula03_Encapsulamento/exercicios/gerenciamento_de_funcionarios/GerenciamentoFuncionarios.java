package com.senai.aula03_Encapsulamento.exercicios.gerenciamento_de_funcionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoFuncionarios {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String menu = """
                _____________________________________________________________________
                |   Escolha uma Opção:                                              |
                |       1- Cadastrar Funcionário                                    |
                |       2- Listar Funcionários                                      |
                |       3- Aumento Salário                                          |
                |       5- Sair                                                     |
                |___________________________________________________________________|
                """;
        int opcao;

        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarFuncionario(funcionarios, scanner);
                    break;

                case 2:
                    listarFuncionarios(funcionarios);
                    break;

                case 3:
                    aumentarSalario(funcionarios, scanner);
                    break;

                case 4:
                    System.out.println("Sair");

                default:
                    System.out.println("Opção inválida!!");
            }
        } while (opcao != 4);

        scanner.close();
    }

    public static void cadastrarFuncionario(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.println("Digite o nome o funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o cargo do funcionário (Gerente, Analista ou Programador): ");
        String cargo = scanner.nextLine();

        funcionarios.add(new Funcionario(nome, salario, cargo));
        System.out.println("Funcionário cadastrado com sucesso!!!");

    }

    public static void listarFuncionarios(ArrayList<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado!");
            for (Funcionario funcionario : funcionarios) {
                System.out.println("Nome: " + funcionario.getNome() + ", Salário: R$ " + funcionario.getSalario() + ", Cargo: " + funcionario.getCargo());
            }
        }
    }

    public static void aumentarSalario(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite  o percentual de aumento: ");
        double percentual = scanner.nextDouble();
        scanner.nextLine();

        for (Funcionario funcionario : funcionarios){
            if (funcionario.getNome().equals(nome)){
                funcionario.calcularAumento(percentual);
                return;
            }
        }
        System.out.println("Funcionário não encontrado!!");
    }
}