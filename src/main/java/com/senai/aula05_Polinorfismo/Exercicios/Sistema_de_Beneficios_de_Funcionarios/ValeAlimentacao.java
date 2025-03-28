package com.senai.aula05_Polinorfismo.Exercicios.Sistema_de_Beneficios_de_Funcionarios;

public class ValeAlimentacao extends Beneficio {
    public ValeAlimentacao(double salario) {
        super(salario);
    }

    @Override
    public double calcularDesconto() {
        return getSalario() *0.05;
    }
}
