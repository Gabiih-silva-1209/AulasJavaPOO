package com.senai.aula05_Polinorfismo.Exercicios.Sistema_de_Beneficios_de_Funcionarios;

public class Main {
    public static void main(String[] args) {
        Beneficio valeAlimentacao =  new ValeAlimentacao(2000);
                Beneficio PlanoDeSaude = new PlanoDeSaude(2500);
        Beneficio AuxilioTransporte = new AuxilioTransporte(3000);

        System.out.println("O desconto salarial do vale alimentação será de: " +valeAlimentacao.calcularDesconto());
        System.out.println("O desconto salarial  do Plano de Saúde será de: " +PlanoDeSaude.calcularDesconto());
        System.out.println("O desconto salarial do Auxilio Transporte será de: " +AuxilioTransporte.calcularDesconto());
    }
}
