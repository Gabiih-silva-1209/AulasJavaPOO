package com.senai.aula05_Polinorfismo.Exemplos.Sistema_de_Pagamento;

public class Freelance extends Pagamento {
    private double valorProjeto;

    public Freelance(String nome, double valorProjeto) {
        super(nome);
        this.valorProjeto = valorProjeto;
    }

    @Override
    public double calcularPagamento() {
        return valorProjeto;
    }
}
