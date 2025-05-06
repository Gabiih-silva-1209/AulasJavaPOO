package com.senai.aula06_Abstracao.Exercicios.Sistema_de_Pagamentos;

public abstract class Pagamento {
    protected String usuario;
    protected double valor;

    public Pagamento(String usuario, double valor) {
        this.usuario = usuario;
        this.valor = valor;
    }

    public void processarPagamento() {
        autenticarUsuario();
        validarAntifraude();
        executarPagamento();
        registrarTransacao();
        registrarLog();
    }

    protected void autenticarUsuario() {
        System.out.println("Autenticando usuário: " + usuario);
    }

    protected void validarAntifraude() {
        System.out.println("Validando segurança antifraude para o valor: R$" + valor);
    }

    protected void registrarTransacao() {
        System.out.println("Registrando transação no banco de dados.");
    }

    protected void registrarLog() {
        System.out.println("Registrando log do pagamento.");
    }

    protected abstract void executarPagamento();
}

