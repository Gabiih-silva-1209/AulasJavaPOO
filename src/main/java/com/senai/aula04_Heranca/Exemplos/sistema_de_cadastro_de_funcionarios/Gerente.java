package com.senai.aula04_Heranca.Exemplos.sistema_de_cadastro_de_funcionarios;

public class Gerente extends Funcionario {
    private double bonus;

    // Construtor da classe Gerente
    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario); // Chamando o construtor da classe base (Funcionario)
        this.bonus = bonus;
    }

    // Getter para o bônus
    public double getBonus() {
        return bonus;
    }

    // Setter para o bônus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Sobrescrevendo o método exibirDados da classe Funcionario
    @Override
    public void exibirDados() {
        System.out.printf("Nome: %s, Salário: R$ %.2f, Bônus: R$ %.2f%n", getNome(), getSalario(), bonus);
    }
}
