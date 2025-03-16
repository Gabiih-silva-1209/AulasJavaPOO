package com.senai.aula04_Heranca.Exercícios.Sistema_de_bibliotecas;

public class LivroDigital extends Livro {
    protected int numeroPaginas;

    public LivroDigital(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(", o livro tem " +numeroPaginas+ "números de páginas");
    }
}
