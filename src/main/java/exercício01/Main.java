package exercício01;

public class Main {
    public static void main(String[] args) {
        Produto produto01 = new Produto("Arroz", 27, 100);
        Produto produto02 = new Produto("Feijão", 15, 150);

        System.out.println("Detalhes sobre o arroz: ");
        produto01.exibirDetalhes();
        System.out.println("O valor total do estoque: R$ " +produto01.calcularValorEstoque());

        System.out.println("Detalhes sobre o feijão: ");
        produto02.exibirDetalhes();
        System.out.println("O valor total do estoque: R$ " +produto02.calcularValorEstoque());
    }
}
