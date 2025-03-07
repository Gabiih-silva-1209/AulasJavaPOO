package com.senai.aula03_Encapsulamento.exemplos.gerenciamento_de_funcionarios;

public class Funcionarios {
    private String nome;
    private double salario;
    private String cargo;
    private String[] listaDeCargos = {"Gerente", "Analista", "Programador"};


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank())
            this.nome = nome;
    }else{
                System.out.println("O campo será atribuido como anônimo");
            }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 1320) {
            this.salario = salario;
        } else {
            System.out.println("O salário dever ser maior que R$ 1.320,00");
            System.out.println("O campo salário será preenchido com R$ 1.320,00");
            this.salario = 1320;
        }
        this.salario = salario;
    }

    public void aumentarSalario(int porcentagemAumento){
        if(porcentagemAumento>0) {
            this.salario += (salario * porcentagemAumento) / 100;
            System.out.println("Aumento de salário do funcionario " +nome + " foi realizado com sucessso. \nValor atualizado do salário é: " +salario);
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {

        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                '}';
    }

    public Funcionarios(String nome, double salario, String cargo, int idCargo) {
        if (nome.isBlank())
            this.nome = nome;
    }else

    {

        {

            {
                System.out.println("Não pode ser nulo ou vazio");
                System.out.println("O campo será atribuido como anônimo");
                this.nome = "anônimo";
            }
            if (salario >= 1320) {
                this.salario = salario;
            } else {
                System.out.println("O salário dever ser maior que R$ 1.320,00");
                System.out.println("O campo salário será preenchido com R$ 1.320,00");
                this.salario = 1320;
            }
            if (idCargo < 1 && idCargo)
                this.cargo = listaDeCargos[idCargo - 1];
        }else{
        System.out.println("Cargo inválido");
        System.out.println("O campo cargo será atribuido como programador");
    }
    }

    }