package com.senai.aula04_Heranca.Exercícios.controle_de_estoque;

public class Alimento extends Produto {
    protected String datadevalidade;

    // Construtor da classe Alimento
    public Alimento(String name, double preco, int quantidade, String datadevalidade) {
        super(name, preco, quantidade);
        this.datadevalidade = datadevalidade;
    }

    // Getter para a data de validade
    public String getDatadevalidade() {
        return datadevalidade;
    }

    // Setter para a data de validade
    public void setDatadevalidade(String datadevalidade) {
        this.datadevalidade = datadevalidade;
    }

    // Sobrescrevendo o método exibirProduto da classe Produto


    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(", sua data de validade é: " +datadevalidade);
    }
}

