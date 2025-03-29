package com.senai.aula05_Polinorfismo.Exercicios.Sistema_de_Beneficios_de_Funcionarios;

public class Beneficio {
    protected double salario;

    public double getSalario() {
        return salario;
    }

    public Beneficio(double salario) {

        this.salario = salario;
    }
    public double calcularDesconto(){

        return 0.0;
    }
}
