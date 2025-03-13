package com.senai.aula04_Heranca.Exemplos.veículos;

public class Veiculos {
    private String  marca;
     private int ano;

    //Contrutor

    public Veiculos (String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }
//get and setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Método comum a todos os veículos

    void exibirDetalhes(){
        System.out.print("Marca: " +marca+ ", Ano: " +ano);
    }
}

