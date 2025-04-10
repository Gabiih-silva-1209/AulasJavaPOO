package com.senai.aula06_Abstracao.Exercicios.Sistema_padronizado_de_check_in;

public interface CheckIn {
        int Maximo_Bagagens = 5;

        void IniciarCheckIn(String nomePassageiro, String numeroVoo);

        void VerificarDocumentos(String Documentos);

        void finalizarCheckIn();

        default int ajustarBagagem(int BagagensAtuais, int ajuste) {
            if (validarBagagens(BagagensAtuais, ajuste)) {
                return BagagensAtuais + ajuste;
            } else {
                System.out.println("Limite de bagagem excedido ou valor inválido");
                return BagagensAtuais;
            }
        }

        static void MensagemBemVindo() {
            System.out.println("Bem-vindo ao Sistema de Check-In do Aeroporto!");
        }

        private Boolean validarBagagens(int BagagensAtuais, int ajuste) {
            return (BagagensAtuais >= 0 && (BagagensAtuais + ajuste >= 0) && (BagagensAtuais + ajuste <= Maximo_Bagagens));
        }
    }

