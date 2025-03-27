package com.senai.aula05_Polinorfismo.Exemplos.Sistema_de_Pagamento;

public class CLT extends Pagamento {
   private double salario;

    public CLT(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return salario;
    }
}
