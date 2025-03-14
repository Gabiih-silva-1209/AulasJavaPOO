package com.senai.aula04_Heranca.Exercícios.sistema_de_funcionarios;

public class Funcionario {
    protected String name;
    protected double salario;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String name, double salario) {
        this.name = name;
        this.salario = salario;


    }
}
