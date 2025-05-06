package com.senai.aula06_Abstracao.Exercicios.Sistema_de_Pagamentos;

public class Pix extends Pagamento {
    public Pix(String usuario, double valor) {
        super(usuario, valor);
    }

    @Override
    protected void executarPagamento() {
        System.out.println("Processando pagamento via PIX...");
    }
}
