package com.senai.aula05_Polinorfismo.Exemplos.Gestao_veiculos;

public class Caminhao extends Veiculo{
    public Caminhao(String nome) {
        super(nome);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Verificação dos freios realizada para o caminhão " +getModelo());
    }
}
