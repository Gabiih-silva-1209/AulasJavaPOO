package com.senai.aula05_Polinorfismo.Exemplos.Gestao_veiculos;

public class Carro extends Veiculo{
    public Carro (String Modelo){
        super(Modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção preventiva realizada para o carro " +getModelo());
    }
}
