package com.senai.aula06_Abstracao.Exemplos.Classe_abstrata.Gerenciamento_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        testarPagamento(new FuncionarioEfetivo("Ysabelly",2000,200));
        testarPagamento(new FuncionarioTemporario("Nathalia", 2000, 10,50));
    }
    public static void testarPagamento(Funcionarios funcionario){
        System.out.println("----- Testando funcionários -------\n ");
        funcionario.exibirDados();
        funcionario.aumentarSalario(10);
        funcionario.exibirDados();
        funcionario.calcularBonus();
        funcionario.exibirDados();
    }
}
