package com.senai.aula05_Polinorfismo.Exercicios.Sistema_de_Reservas_de_hotel;

public class Main {
    public static void main(String[] args) {
        Reserva reservaSimples = new Reserva(5, 100);
        Reserva reservaVIP = new ReservaVIP(5, 100, 0.2);

        reservaSimples.calularCustoTotal();
        reservaVIP.calularCustoTotal();

        System.out.println("O custo da Reserva simples é: " +reservaSimples.calularCustoTotal());
        System.out.println("O custo da Reserva VIP é: " +reservaVIP.calularCustoTotal());
    }
}
