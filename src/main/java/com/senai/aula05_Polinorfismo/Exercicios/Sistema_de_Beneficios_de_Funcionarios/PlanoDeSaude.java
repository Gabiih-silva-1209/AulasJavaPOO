package com.senai.aula05_Polinorfismo.Exercicios.Sistema_de_Beneficios_de_Funcionarios;

public class PlanoDeSaude extends Beneficio {
    public PlanoDeSaude(double salario) {
        super(salario);
    }

    @Override
    public double calcularDesconto() {
        return getSalario()* 0.1;
    }
}
