package com.senai.aula04_Heranca.Exercícios.Sistema_de_bibliotecas;

public class LivroDigital extends Livro {
    protected double tamanhoArquivoMB;

    public LivroDigital(String titulo, String autor, double tamanhoArquivoMB) {
        super(titulo, autor);
        if (tamanhoArquivoMB >= 0) {
            this.tamanhoArquivoMB = tamanhoArquivoMB;
        }else{
            System.out.println("O tamabnho do arquivo MB não pode ser negativo!");
            this.tamanhoArquivoMB = 0;
        }
    }

    public double getTamanhoArquivoMB() {
        return tamanhoArquivoMB;
    }

    public void setTamanhoArquivoMB(double tamanhoArquivoMB) {
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
    }

    @Override
    public String toString() {
        return "LivroDigital{" +
                "tamanhoArquivoMB=" + tamanhoArquivoMB +
                '}';
    }
}

