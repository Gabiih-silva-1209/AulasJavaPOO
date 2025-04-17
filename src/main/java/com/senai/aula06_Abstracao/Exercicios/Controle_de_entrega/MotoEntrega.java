package com.senai.aula06_Abstracao.Exercicios.Controle_de_entrega;

public class MotoEntrega extends Veiculo {
    protected int velocidadeMaximaPermitida;


    public MotoEntrega(int velocidadeAtual, int capacidadeMaximaDeCarga, int velocidadeMaximaPermitida) {
        super(velocidadeAtual, capacidadeMaximaDeCarga);
        this.velocidadeMaximaPermitida = velocidadeMaximaPermitida;
    }

    @Override
    public void mostrarDetalhes() {

    }

    @Override
    public void acelerar(int acelerar) {
        if (VelocidadeAtual + acelerar <= velocidadeMaximaPermitida) ;
        VelocidadeAtual += acelerar;
        System.out.println("A moto está acelerando. A nov velocidade é: " + VelocidadeAtual + "Km/h");
    }else

    {
        System.out.println("A velocidade máxima permitida para a Moto foi atingida!!");
    }
    @Override
    public void reduzirVelocidade(int diminuir) {
if (v)
    }
}
