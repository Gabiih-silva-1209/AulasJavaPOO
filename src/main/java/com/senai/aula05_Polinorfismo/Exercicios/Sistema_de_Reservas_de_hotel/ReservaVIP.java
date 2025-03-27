package com.senai.aula05_Polinorfismo.Exercicios.Sistema_de_Reservas_de_hotel;

public class ReservaVIP extends Reserva{
    protected double desconto;

    public ReservaVIP(int dias, double valorDiaria, double desconto) {
        super(dias, valorDiaria);
        this.desconto = desconto;
    }

    @Override
    public double calularCustoTotal() {
        return super.calularCustoTotal() * (1 - desconto);
    }
}
