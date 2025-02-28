package com.senai.aula03_Encapsulamento;
//Definição da class Carro
public class Carro {
    //Atributo privado: só pode ser acessado dentro da própria class
    private int velocidade;

    //Contrutor da classe
    public Carro(){
        velocidade = 0; //Inicialmente o carro está parado
    }
//Metodo públio para obter a velocidade (Getter)

    public int getVelocidade() {
        return velocidade;
    }

    //Metodo público para definir a velocidade (Setter)

    public void setVelocidade(int velocidade) {
        if (velocidade>=0){ // Regra de negócio: velocidade não pode ser negativa
            this.velocidade = velocidade;

        }else {
            System.out.println("Velocidade inválida!!");
        }
    }
}
