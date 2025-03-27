package com.senai.aula05_Polinorfismo.Exercicios.Sistema_de_Reservas_de_hotel;

public class ReservaSimples extends Reserva{

    public ReservaSimples(int dias, double valorDiaria) {
        super(dias, valorDiaria);
    }

    @Override
    public double calularCustoTotal() {
        return super.calularCustoTotal();
    }
}
