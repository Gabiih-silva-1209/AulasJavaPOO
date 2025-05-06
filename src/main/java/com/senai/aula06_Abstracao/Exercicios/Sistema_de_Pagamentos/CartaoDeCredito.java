package com.senai.aula06_Abstracao.Exercicios.Sistema_de_Pagamentos;

public class CartaoDeCredito extends Pagamento {
    public CartaoDeCredito(String usuario, double valor) {
        super(usuario, valor);
    }

    @Override
    protected void executarPagamento() {
        System.out.println("Processando pagamento com Cartão de Crédito...");
    }
}

