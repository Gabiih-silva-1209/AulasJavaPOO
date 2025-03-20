package com.senai.aula04_Heranca.Exercícios.Sistema_de_bibliotecas;

public class LivroFisico extends Livro {
    protected int numeroPaginas;

    public LivroFisico(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);

        if(numeroPaginas >=0)

    {
        this.numeroPaginas = numeroPaginas;
    }else

    {
        System.out.println("O número da página não pode ser negativo!! Foi atribuido o valor 0 para este caso.");
        this.numeroPaginas = 0;
    }
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

