package com.senai.aula06_Abstracao.Exercicios.Sistema_padronizado_de_check_in;

public class Latam implements CheckIn {
    protected String NomePassageiro;
    protected String NumeroVoo;
    protected int bagagens;

    public Latam() {
        this.bagagens = 0;
    }

    public void IniciarCheckIn(String nomePassageiro, String numeroVoo) {
        NomePassageiro = nomePassageiro;
        NumeroVoo = numeroVoo;

    }

    @Override
    public void VerificarDocumentos(String Documentos) {
        System.out.println("Verificando documentos do passageiro: " + Documentos + " na Latam.");

    }

    @Override
    public void finalizarCheckIn() {
        System.out.println("Check-In finalizado para o passageiro: " + NomePassageiro + " no voo Gol: " + NumeroVoo);
    }

    public void adicionarBagagem(){
        System.out.println("Bagagens: " +(bagagens =ajustarBagagem(bagagens,1)));
    }
    public void removerBagagem() {
        System.out.println("Bagagens: " + (bagagens = ajustarBagagem(bagagens, -1)));
    }

}

