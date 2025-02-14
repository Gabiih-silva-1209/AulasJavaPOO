package exercício04;

import exercício01.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
       ArrayList<Produto>produtos = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);
       String menu = """
               __________________________________
               |                                 |
               |  Escolha uma opção:             |
               |  1- Cadastrar Produto.          |                    
               |  2- Listar Produtos.            |
               |  3- Sair                        |
               |                                 |
               |_________________________________|               
       """;
       int opcao;
       do {
           System.out.println(menu);
           opcao = scanner.nextInt();
           scanner.nextLine();

           switch (opcao){
               case 1:
                   cadastrarProdutos(produtos, scanner);
                   break;

               case 2:
                   listarProdutos(produtos);
                   break;

               case 3:
                   System.out.println("Sair");
                   scanner.close();
               default:
                   System.out.println("Opção Inválida!!!");

           }
       }while(opcao !=3);

    }public static void cadastrarProdutos(ArrayList<Produto>produtos, Scanner scanner) {
        System.out.println("Cadastrar produto.");

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        produtos.add(new Produto(nome, preco));
        System.out.println("Produto cadastrado com sucesso!!");
    }

    public static void listarProdutos(ArrayList<Produto>produtos) {
        System.out.println("Listar produtos");
if (produtos.isEmpty()){
    System.out.println("Não há produtos cadastrados.");
}else {
    for (Produto produto : produtos){
        System.out.println("Nome" +produto.getNome() +", Preço: R$" +produto.getPreco);
    }
}
    }
    }


