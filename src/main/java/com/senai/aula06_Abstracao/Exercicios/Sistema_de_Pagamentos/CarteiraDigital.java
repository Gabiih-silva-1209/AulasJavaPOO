package com.senai.aula06_Abstracao.Exercicios.Sistema_de_Pagamentos;

public class CarteiraDigital extends Pagamento {
    public CarteiraDigital(String usuario, double valor) {
        super(usuario, valor);
    }

    @Override
    protected void executarPagamento() {
        System.out.println("Processando pagamento com Carteira Digital...");
    }
}

