package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    private String tipoDaConta;
    private String cpf;
    private String nome;
    private String endereco;
    private String numeroDaConta;
    private double saldo;  // mudei de int para double
    protected double limite;
    private List<Transacao> extrato;  // extrato pertence à conta!

    public Conta(
            String nome,
            String cpf,
            String endereco,
            String tipoDaConta,
            String numeroDaConta,
            double limite,
            double saldo
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.tipoDaConta = tipoDaConta;
        this.numeroDaConta = numeroDaConta;
        this.limite = limite;
        this.saldo = saldo;
        this.extrato = new ArrayList<>();
    }

    // Getters e Setters
    public String getTipoDaConta() { return tipoDaConta; }
    public void setTipoDaConta(String tipoDaConta) { this.tipoDaConta = tipoDaConta; }
    public String getCpf() { return cpf; }
    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getNumeroDaConta() { return numeroDaConta; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public double getLimite() { return limite; }
    public List<Transacao> getExtrato() { return extrato; }

    public void adicionarTransacao(Transacao transacao) {
        this.extrato.add(transacao);
    }

    @Override
    public String toString() {
        return getTipoDaConta();
    }

    public abstract void sacar(double valor);
}