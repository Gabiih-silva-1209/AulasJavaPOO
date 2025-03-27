package com.senai.aula05_Polinorfismo.Exemplos.Gestao_veiculos;

public class Moto extends Veiculo{
    public Moto(String nome) {
        super(nome);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Troca de óleo realizada para a moto "+getModelo());
    }
}
