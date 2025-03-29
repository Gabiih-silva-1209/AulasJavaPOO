package com.senai.aula02_colecoes.exercicios.gerenciamento_de_tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\n Gerenciador de Tarefas");
            System.out.println("1- Adicionar tarefa");
            System.out.println("2- Listar tarefas");
            System.out.println("3- Marcar tarefa como concluída");
            System.out.println("4- Remover tarefa");
            System.out.println("5- Sair");
            System.out.println("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a descrição da tarefa. ");
                    String descricao = scanner.nextLine();
                    tarefas.add(descricao);
                    System.out.println("Tarefa adicionada com sucesso!! ");
                    break;

                case 2:
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas cadastradas!!!");
                    } else {
                        System.out.println("\n Lista de tarefas: ");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + "-" + tarefas.get(i));
                        }
                    }
                    break;
                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas cadastradas!!! ");
                    } else {
                        System.out.println("Digite o número da tarefa para marcer como concluída: ");
                        int numero = scanner.nextInt();
                        scanner.nextLine();
                        if (numero > 0 && numero <= tarefas.size()) {
                            tarefas.set(numero - 1, tarefas.get(numero - 1) + "(Concluída!!)");
                            System.out.println("Tarefa marcada como concluída!!!");
                        } else {
                            System.out.println("Número de tarefa inválido!!!");
                        }
                    }
                    break;
                case 4:
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas cadastradas!!!");
                    } else {
                        System.out.println("Digite o número da tarefa  para remover:");
                        int numero = scanner.nextInt();
                        scanner.nextLine();
                        if (numero > 0 && numero <= tarefas.size()) {
                            tarefas.remove(numero - 1);
                            System.out.println("Tarefa removida com sucesso!!!");
                        } else {
                            System.out.println("Número de tarefa inválido!!!");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa!!!");
                    break;
                default:
                    System.out.println("Opção inválida!!!");
            }
        } while (opcao != 5);
        scanner.close();
    }
}

