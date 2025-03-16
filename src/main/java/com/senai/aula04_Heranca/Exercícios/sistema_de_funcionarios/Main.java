package com.senai.aula04_Heranca.Exercícios.sistema_de_funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
Professor professor1 = new Professor("Gabrieli", 3500, "Letras - Português e Inglês");
Professor professor2 = new Professor("Ysabelly", 4000, "Letras - Português e Coreano");
Professor professor3 = new Professor("Nathalia", -3000, "Matemática");

        List<Professor>equipe = new ArrayList<>();
equipe.add(professor1);
equipe.add(professor2);

Coordernador coordernador1 = new Coordernador("Maria", 4500, equipe);

        System.out.println("\n ---------------- Teste 1 -------------------------- \n");
    professor1.exibirDetalhes();
    professor2.exibirDetalhes();
    professor3.exibirDetalhes();

        System.out.println("\n ---------------------------- Teste 2 --------------------------- \n");
        coordernador1.exibirDetalhes();
    }
}
