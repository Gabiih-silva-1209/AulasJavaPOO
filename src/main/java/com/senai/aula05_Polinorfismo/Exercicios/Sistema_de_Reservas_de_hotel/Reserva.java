package com.senai.aula05_Polinorfismo.Exercicios.Sistema_de_Reservas_de_hotel;

public class Reserva {
    protected  int dias;
    protected double valorDiaria;

    public Reserva(int dias, double valorDiaria) {
        this.dias = dias;
        this.valorDiaria = valorDiaria;
    }
    public double calularCustoTotal(){
        return dias * valorDiaria;
    }
}
