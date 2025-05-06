package com.senai.aula07_mvc.crud_usuario.View;

import com.senai.aula07_mvc.crud_usuario.Controller.OperadorController;
import com.senai.aula07_mvc.crud_usuario.Controller.SupervisorController;
import com.senai.aula07_mvc.crud_usuario.Model.Operador;
import com.senai.aula07_mvc.crud_usuario.Model.Supervisor;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorController opController = new OperadorController();
        SupervisorController supController = new SupervisorController();

        String menu =
                """
                        Menu
                        1- Cadastrar usuário
                        2- Deletar usuário
                        3- Atualizar usuário
                        4- Exibir usuário
                        5- Ligar máquina
                        6- Demitir operador
                        7- sair
                        """;
        int opcao = 0;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Qual é o tipo de usuário??");
            System.out.println("1 - Operador");
            System.out.println("2- Supervisor");
            int escolherTipo = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Preencha os dados a seguir:");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    String Nome = scanner.nextLine();
                    System.out.print("Nome: ");

                    if (escolherTipo == 1) {
                        System.out.print("Setor: ");
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(Nome, id, setor);
                        if (opController.cadastrarOperador(operador)) {
                            System.out.print("Cadastrado com sucesso!!");
                        } else {
                            System.out.println("Não foi possível cadastrar!!");
                        }
                    } else if (escolherTipo == 2) {
                        System.out.println("Área: ");
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(Nome, id, area);
                        if (opController.cadastrarSupervisor(supervisor)) {
                            System.out.print("Cadastrado com sucesso!!");
                        } else {
                            System.out.println("Não foi possível cadastrar!!");
                        }
                    }
                    break;

                case 2:
                    if (escolherTipo == 1)
                        opController.listarOperadores().forEach(System.out::println);
                    else if (escolherTipo == 2)
                        supController.listarSupervisores().forEach(System.out::println);
                    System.out.print("Escolha um usuário pelo ID para deletar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    if (escolherTipo == 1)
                        opController.deletarOperador(id);
                    else if (escolherTipo == 2) {
                        supController.deletarSupervisor(id);
                        break;

                        case 3:
                            if (escolherTipo == 1)
                                opController.listarOperadores().forEach(System.out::println);
                            else if (escolherTipo == 2) {
                                supController.listarSupervisores().forEach(System.out::println);

                                System.out.println("Escolha um usuário para atualizar");
                                id = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Atualize as seguintes informações: ");
                                System.out.println("Nome: ");
                                Nome = scanner.nextLine();

                                if (escolherTipo == 1) {
                                    System.out.println("Setor: ");
                                    String Setor = new Operador(Nome, id, Setor);
                                    opController.atualizrOperador(Operador);
                                } else if (escolherTipo == 2) {
                                    System.out.println("Area: ");
                                    String area = scanner.nextLine();
                                    Supervisor supervisor = new Supervisor(Nome, id, area);
                                    supController.atualizarSupervisor(Supervisor);
                                }
                                System.out.println("Usuário atualizado com sucesso!!");
                                break;

                                case 4:
                                    if (escolherTipo == 1) {
                                        opController.listarOperadores().forEach(System.out::println);
                                    } else if (escolherTipo == 2) {
                                        supController.listarSupervisores().forEach(System.out::println);

                                    }
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    break;
                                case 7:
                                    System.out.println("Saindo do sistema!!");
                                default:
                                    System.out.println("Opção inválida!");
                                    break;
                            }
                    }while (opcao != 7) ;
                    scanner.close();
            }
        }
    }
}