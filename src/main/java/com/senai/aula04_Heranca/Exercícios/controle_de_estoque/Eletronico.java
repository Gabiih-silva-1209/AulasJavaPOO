package com.senai.aula04_Heranca.Exercícios.controle_de_estoque;

public class Eletronico extends Produto {
    protected int voltagem;

    public Eletronico(String name, double preco, int quantidade, int voltagem) {
        super(name, preco, quantidade);
        setVoltagem(voltagem);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        if (voltagem == 110 || voltagem == 220) {
            this.voltagem = voltagem;
        }else{
            System.out.println("Voltagem inválida. A voltagem devem ser 110 ou 220.  ");
       this.voltagem = 0;
        }
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(" , Voltagem: " +(voltagem ==0? " Inválida" :voltagem + "V") );
    }
}

