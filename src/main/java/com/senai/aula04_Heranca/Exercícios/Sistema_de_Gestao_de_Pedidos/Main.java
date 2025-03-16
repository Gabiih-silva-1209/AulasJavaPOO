package com.senai.aula04_Heranca.Exercícios.Sistema_de_Gestao_de_Pedidos;

public class Main {
    public static void main(String[] args) {
 Pedido pedido1 = new Pedido(5, 60);
 Pedido pedido2 = new Pedido(10, -120);

 pedido1.exibirDetalhes();
 pedido2.exibirDetalhes();

        System.out.println("\n--------- Teste 1: Pedido online -------------\n");
PedidoOnline pedidoOnline1 = new PedidoOnline(6, 350, 50);
PedidoOnline pedidoOnline2 = new PedidoOnline(-6,-150, -30);

pedidoOnline1.exibirDetalhes();
pedidoOnline2.exibirDetalhes();

        System.out.println("\n--------- Teste 2: Pedido Presencial -------------\n");
        PedidoPresencial pedidoPresencial1 = new PedidoPresencial(8, 40, 50);
        PedidoPresencial pedidoPresencial2 = new PedidoPresencial(3, 30, -10); // Valores negativos para teste
        PedidoPresencial pedidoPresencial3 = new PedidoPresencial(5, 20, 200); // Desconto maior que o total
        pedidoPresencial1.exibirDetalhes();
        pedidoPresencial2.exibirDetalhes();
        pedidoPresencial3.exibirDetalhes();
    }
}
