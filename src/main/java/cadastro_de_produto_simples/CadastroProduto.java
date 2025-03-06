package exercício04Encapsulamento01;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String menu = """
                _____________________________________________________________________
                |   Escolha uma Opção:                                              |
                |       1- Cadastrar produto                                        |
                |       2- Listar produto                                           |
                |       3- Sair                                                     |
                |___________________________________________________________________|
                """;
        int opcao;

        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto(produtos, scanner);
                    break;

                case 2:
                    listarProdutos(produtos);
                    break;

                case 3:
                    System.out.println("Sair");
                    break;

                default:
                    System.out.println("Opção inválida!!!");
            }
        } while (opcao != 3);

        scanner.close();
    }


    public static void cadastrarProduto(ArrayList<Produto> produtos, Scanner scanner) {
        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        produtos.add(new Produto(nome, preco));
        System.out.println("Produto cadastrado com sucesso!!");
    }

    public static void listarProdutos(ArrayList<Produto> produtos) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de produtos:");
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome() + ", Preço: R$ " + produto.getPreco());
            }
        }
    }
}


