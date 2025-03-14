package com.senai.aula04_Heranca.Exercícios.controle_de_estoque;

public class Alimento extends Produto {
    protected String datadevalidade;

    public Alimento(String name, double preco, int quantidade, String datadevalidade) {
        super(name, preco, quantidade);
        this.datadevalidade = datadevalidade;
    }

    public String getDatadevalidade() {
        return datadevalidade;
    }

    public void setDatadevalidade(String datadevalidade) {
        this.datadevalidade = datadevalidade;

        @Override
        void exibirProduto(){
            super.exibirProduto();
            System.out.println(", a data de validade é: "+datadevalidade);
        }

    }
}

