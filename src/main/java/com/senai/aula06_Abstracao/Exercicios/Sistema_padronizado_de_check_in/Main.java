package com.senai.aula06_Abstracao.Exercicios.Sistema_padronizado_de_check_in;


public class Main {
    public static void main(String[] args) {
CheckIn.MensagemBemVindo(new Gol("Nathalia",1));
        CheckIn.MensagemBemVindo(new Latam("Ysabelly",65,));

    }
    public static void testarAparelhos(AparelhosInteligentes aparelhosInteligentes){
        System.out.printf("------ teste %s-----\n", aparelhosInteligentes.getClass().getSimpleName());
        aparelhosInteligentes.ligar();
        if(aparelhosInteligentes instanceof LampadaInteligente lampadaInteligente){
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.baixarBrilho();
            lampadaInteligente.baixarBrilho();
            lampadaInteligente.baixarBrilho();
        } else if (aparelhosInteligentes instanceof  TVSmart tvsmart) {
            tvsmart.aumentarVolume();
            tvsmart.aumentarVolume();
            tvsmart.baixarVolume();
            tvsmart.baixarVolume();
            tvsmart.baixarVolume();
        }
        aparelhosInteligentes.desligar();
    }
}

    }
}
