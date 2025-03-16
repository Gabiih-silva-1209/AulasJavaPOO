package com.senai.aula04_Heranca.Exercícios.Sistema_de_Gestao_de_Pedidos;

public class PedidoPresencial extends Pedido {
    protected double desconto;

    public PedidoPresencial(int numeroPedido, double valorTotal, double desconto) {
        super(numeroPedido, valorTotal);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if(desconto <0) {
            System.out.println("O valor do desconto não pode ser negativo. Atribua uma valor positivo.");
            this.desconto = 0;
        }else if (desconto > (valorTotal)){
            System.out.println("O valor do desconto não pode ser maior que o valor da compra. Atribua um valor menor");
            this.desconto = valorTotal *(desconto/100);
        }else {
        this.desconto = desconto;
    }
        }
    public double calcularTotalComDesconto(){
        return getValorTotal() -desconto;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        double total = valorTotal - desconto;
        System.out.println(", incluinfo o desconto de R$ " +desconto+ "o novo valor da compra é: R$ " +total);
    }
}
