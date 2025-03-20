package com.senai.aula04_Heranca.Exercícios.Sistema_de_Gestao_de_Pedidos;

public class Pedido {
    protected  int numeroPedido;
    protected  double valorTotal;

    public Pedido(int numeroPedido, double valorTotal) {
        this.numeroPedido = numeroPedido;
        this.valorTotal = valorTotal;
        if (valorTotal <= 0) {
            this.valorTotal = 0;
        }else{
            System.out.println("O valor total do pedido não pode ser negativo.");
        }
        if(valorTotal<0) {
            System.out.println("Valor total inválido! O valor total não pode ser negativo!");
            this.valorTotal = 0;
        }else{
            this.valorTotal= valorTotal;
        }
    }


    public int getNumeroPedido() {

        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        if(numeroPedido <0) {
            System.out.println("O número do pedido não pode ser negativa.");
            this.numeroPedido = 0;
        }else{
            this.numeroPedido = numeroPedido;
        }
    }

    public double getValorTotal() {

        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        if (valorTotal < 0) {
            System.out.println("O valor total não pode ser negativo!");
            this.valorTotal = 0;
        } else {
            this.valorTotal = valorTotal;
        }
    }
    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", valorTotal=" + valorTotal +
                '}';
    }
    void exibirDetalhes(){
        System.out.println("O número do pedido é: " +numeroPedido+ " seu valor total é de: " +valorTotal);
    }
}
