package com.senai.aula01_introducao_poo.exemplos.concessionária;

public class Carro {
    String marca;
    String modelo;
    int anoFabricacao;
    String placa;
    String cor;
    int quilometragem;
    double preco;

    public Carro(String marca, String modelo, int anoFabricacao, String placa, String cor, int quilometragem, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.placa = placa;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.preco = preco;

    }

    public void testeDriver() {
        System.out.println("Vrruummmm, ligar o carro, e coloca o pé até o final da embreagemmmm!! " + modelo + " está sendo testado");

    }

    public void comprar(String nomeCliente) {
        System.out.println("Parabéns! " + nomeCliente + "Você comprou o " + marca + " " + modelo);

    }

    public void valorTabelaFipe(int anoAtual) {
        int idadeCarro = anoAtual -this.anoFabricacao;
        double valorComDesvalorizacao = preco;

        for (int i = 0; i < idadeCarro; i++) {
            valorComDesvalorizacao -= valorComDesvalorizacao * 0.02;

        }
        System.out.println( "O " +modelo + "no ano" +anoAtual+ " vale R$%f " +valorComDesvalorizacao+ "na Tabela Fipe");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", quilometragem=" + quilometragem +
                ", preco=" + preco +
                '}';
    }
}
