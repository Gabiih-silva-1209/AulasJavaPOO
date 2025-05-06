package com.senai.aula07_mvc.crud_usuario.Model;

public abstract class Usuario {
    private String Nome;
    private  int id;

    public Usuario(String nome, int id) {
        this.Nome = Nome;
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Nome='" + Nome + '\'' +
                ", id=" + id +
                '}';
    }
}
