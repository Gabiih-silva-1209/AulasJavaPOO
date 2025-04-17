package com.senai.aula06_Abstracao.Exemplos_Interface.Aparelho_Inteligente_slide;

public interface AparelhoInteligente {
    int Nivel_Maximo = 100;

    void ligar();

    void desligar();

    default int ajustarNivel(int nivelAtual, int ajuste) {
        if (validarNivel(nivelAtual, ajuste)) {
            return nivelAtual + ajuste;
        } else {
            return nivelAtual;
        }
    }

    static void MensagemBemVindo() {
        System.out.println("Bem-vindo ao Controle Remoto Inteligente!");
    }

    private Boolean validarNivel(int nivel, int ajuste) {
        return (nivel >= 0 && (nivel <= Nivel_Maximo) && (nivel + ajuste != -1) && (nivel + ajuste != 101));
    }
}

