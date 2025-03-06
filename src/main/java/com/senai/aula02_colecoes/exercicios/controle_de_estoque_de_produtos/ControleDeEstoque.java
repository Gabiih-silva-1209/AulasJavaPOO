package com.senai.aula02_colecoes.exercicios.controle_de_estoque_de_produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleDeEestoque {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n Controle de Estoque");
            System.out.println("1- Cadastrar produto");
            System.out.println("2- Listar produtos");
            System.out.println("3- Atualizar quantidade");
            System.out.println("4- Remover produto");
            System.out.println("5-Buscar produto");
            System.out.println("6- Sair");
            System.out.println("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    produtos.add(nome);
                    quantidades.add(quantidade);
                    System.out.println("Produto cadastrado com sucesso!!!");
                    break;

                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados!!!");
                    } else {
                        System.out.println("\n Lista de produtos: ");
                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println((i + 1) + "-" + produtos.get(i) + "(Quantidade: " + quantidades.get(i) + ")");
                        }
                    }
                    break;
                case 3:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados!!!");
                    } else {
                        System.out.println("Digite o nome do produto para atualizar a quantidade: ");
                        String nomeBusca = scanner.nextLine();
                        for (int i = 0; i < produtos.size(); i++) {
                            if (produtos.get(i).equals(nomeBusca)) {
                                System.out.println("Digite a nova quantidade: ");
                                int novaQuantidade = scanner.nextInt();
                                scanner.nextLine();
                                quantidades.set(i, novaQuantidade);
                                System.out.println("Quantidade atualizada com sucesso!!!");
                                break;
                            }
                        }
                        System.out.println("Produto não encontrado!!!");
                    }
                    break;
                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados!!!");
                    } else {
                        System.out.println("Digite o nome do produto para remover: ");
                        String nomeBusca = scanner.nextLine();
                        for (int i = 0; i < produtos.size(); i++) {
                            if (produtos.get(i).equals(nomeBusca)) {
                                produtos.remove(i);
                                System.out.println("Produto removido com sucesso!!");
                                break;
                            }
                        }
                        System.out.println("Produto não encontrado!!!");
                    }
                    break;
                case 5:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados.");
                    } else {
                        System.out.println("Digite o nome do produto para buscar: ");
                        String nomeBusca = scanner.nextLine();
                        for (int i = 0; i < produtos.size(); i++) {
                            if (produtos.get(i).equals(nomeBusca)) {
                                System.out.println("Produto encontrado: " + produtos.get(i) + "(Quantidade: " + quantidades.get(i) + ")");
                                break;
                            }
                        }
                        System.out.println("Produto encontrado!!!");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do programa!!!");
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }
        } while (opcao != 6);
        scanner.close();
    }
}
class Produto{
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
    public String getNome (){
        return nome;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}