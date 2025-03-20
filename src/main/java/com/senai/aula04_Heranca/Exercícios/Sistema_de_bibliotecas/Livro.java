package com.senai.aula04_Heranca.Exercícios.Sistema_de_bibliotecas;

public class Livro {
    protected  String Titulo;
    protected  String Autor;

    public Livro(String titulo, String autor) {
        Titulo = titulo;
        Autor = autor;
    }

    public String getTitulo() {

        return Titulo;
    }

    public void setTitulo(String titulo) {

        Titulo = titulo;
    }

    public String getAutor() {

        return Autor;
    }

    public void setAutor(String autor) {

        Autor = autor;
    }
    void exibirDetalhes(){
        System.out.println("O título do livro é: " +getTitulo() + "do autor: " +getAutor());
    }
}
