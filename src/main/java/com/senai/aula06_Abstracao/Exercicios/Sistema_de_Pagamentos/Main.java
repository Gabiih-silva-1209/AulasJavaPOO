package com.senai.aula06_Abstracao.Exercicios.Sistema_de_Pagamentos;

public class Main {
    public static void main(String[] args) {
        Pagamento p1 = new CartaoDeCredito("Gabrieli", 200);
        Pagamento p2 = new Pix("Gabrieli", 75);
        Pagamento p3 = new CarteiraDigital("Gabrieli", 30);

        System.out.println("=== Pagamento com Cartão ===");
        p1.processarPagamento();

        System.out.println("\n=== Pagamento com PIX ===");
        p2.processarPagamento();

        System.out.println("\n=== Pagamento com Carteira Digital ===");
        p3.processarPagamento();
    }
}

