package com.senai.aula04_Heranca.Exercícios.Sistema_de_Gestao_de_Pedidos;

public class PedidoOnline extends Pedido {
    protected double taxaEntrega;

    public PedidoOnline(int numeroPedido, double valorTotal, double taxaEntrega) {
        super(numeroPedido, valorTotal);
        this.taxaEntrega = taxaEntrega;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        if (taxaEntrega < 0) {
            System.out.println("A taxa de entrega não pode ser negativa.");
            this.taxaEntrega = 0;
        } else {
            this.taxaEntrega = taxaEntrega;
        }
    }

    public double calcularTotalComEntrega() {
        return getValorTotal() + taxaEntrega;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        double total = (valorTotal + taxaEntrega);
        System.out.println(" Mais a taxa de entrega de: " +taxaEntrega+ " fica no valor de R$ " +total);
    }
}
