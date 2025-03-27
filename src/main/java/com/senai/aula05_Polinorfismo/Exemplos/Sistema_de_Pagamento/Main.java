package com.senai.aula05_Polinorfismo.Exemplos.Sistema_de_Pagamento;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamento>listaPagamento = new ArrayList<>();

        listaPagamento.add(new CLT("Gabrieli", 10000));
        listaPagamento.add(new PJ("Ysabelly", 100,300));
        listaPagamento.add(new Freelance("Nathalia", 10000));

        listaPagamento.forEach(pagamento ->
                        System.out.printf("%s rebece R$%,.2f\n", pagamento.getNome(), pagamento.calcularPagamento())
                );

    }
}
