package com.senai.aula04_Heranca.Exercícios.Sistema_de_bibliotecas;

public class LivroFisico extends Livro {
    protected double tamanhoArquivoMB;

    public LivroFisico(String titulo, String autor, double tamanhoArquivoMB) {
        super(titulo, autor);
        this.tamanhoArquivoMB = tamanhoArquivoMB;
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
        System.out.println("O tamanho do arquivo é :" +getTamanhoArquivoMB()+ "MB");
    }
}
