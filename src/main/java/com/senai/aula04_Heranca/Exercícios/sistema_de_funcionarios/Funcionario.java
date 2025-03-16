package com.senai.aula04_Heranca.Exercícios.sistema_de_funcionarios;

public class Funcionario {
    protected String nome;
    protected double salario;

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        setSalario(salario); // Garantimos a validação no setter
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("Erro: O sálario não pode ser negativo " + nome + ". Atribuindo R$ 0,00 como salário.");
            this.salario = 0.0;
        } else {
            this.salario = salario;
        }
    }

    // Método para exibir detalhes
    public void exibirDetalhes() {
        System.out.print("Nome: " + nome + ", Salário: R$ " + salario);
    }
}