package com.senai.aula05_Polinorfismo.Exemplos.Sistema_de_Pagamento;

public class PJ extends Pagamento {
    private double valorHoras;
    private double horasTrabalhadas;

    public PJ(String nome, double valorHoras, double horasTrabalhadas) {
        super(nome);
        this.valorHoras = valorHoras;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHoras;
    }
}
