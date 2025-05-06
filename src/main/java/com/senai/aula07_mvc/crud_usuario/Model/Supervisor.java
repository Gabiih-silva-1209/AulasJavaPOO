package com.senai.aula07_mvc.crud_usuario.Model;

public class Supervisor extends Usuario{
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Supervisor(String nome, int id, String area) {
        super(nome, id);
        this.area = area;

    }

    @Override
    public String toString() {
        return String.format("ID: %d, Nome: %s, Setor: %s",super.getId(),super.getNome(),area);
    }
}
