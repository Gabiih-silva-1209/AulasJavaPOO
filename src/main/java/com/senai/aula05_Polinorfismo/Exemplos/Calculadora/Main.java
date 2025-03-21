package com.senai.aula05_Polinorfismo.Exemplos.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somar(5,6);
        calculadora.somar(5,8,7);
        calculadora.somar(6.3,9.3);
        calculadora.somar(8,6.3);
        calculadora.somar(9.5,7);
    }
}
