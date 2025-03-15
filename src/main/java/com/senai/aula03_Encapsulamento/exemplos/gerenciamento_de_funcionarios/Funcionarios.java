package com.senai.aula03_Encapsulamento.exemplos.gerenciamento_de_funcionarios;

public class Funcionarios {
    private String nome;
    private double salario;
    private String cargo;
    private String[] listaDeCargos = {"Gerente", "Analista", "Programador"};

    // Construtor
    public Funcionarios(String nome, double salario, int idCargo) {
        setNome(nome);
        setSalario(salario);
        setCargo(idCargo);
    }

    // Getter e Setter para Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("Nome inválido. O campo será atribuído como 'Anônimo'.");
            this.nome = "Anônimo";
        } else {
            this.nome = nome;
        }
    }

    // Getter e Setter para Salário
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 1320) {
            this.salario = salario;
        } else {
            System.out.println("O salário deve ser maior ou igual a R$ 1.320,00. Definindo salário para R$ 1.320,00.");
            this.salario = 1320;
        }
    }

    // Getter e Setter para Cargo
    public String getCargo() {
        return cargo;
    }

    public void setCargo(int idCargo) {
        if (idCargo >= 1 && idCargo <= listaDeCargos.length) {
            this.cargo = listaDeCargos[idCargo - 1];
        } else {
            System.out.println("Cargo inválido. O cargo será atribuído como 'Programador'.");
            this.cargo = "Programador";
        }
    }

    // Método para aumentar salário
    public void aumentarSalario(int porcentagemAumento) {
        if (porcentagemAumento > 0) {
            this.salario += (salario * porcentagemAumento) / 100;
            System.out.println("Aumento de salário aplicado com sucesso.");
            System.out.println("Novo salário de " + nome + ": R$ " + salario);
        } else {
            System.out.println("Aumento inválido! A porcentagem deve ser maior que 0.");
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Funcionário{" +
                "nome='" + nome + '\'' +
                ", salário= R$ " + salario +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
