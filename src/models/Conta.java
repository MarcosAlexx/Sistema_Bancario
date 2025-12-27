package models;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    private String tipoDaConta;
    private String cpf;
    private String nome;
    private String endereco;
    private String numeroDaConta;
    protected int saldo;
    protected double limite;


    public Conta(
            String nome,
            String cpf,
            String endereco,
            String tipoDaConta,
            String numeroDaConta,
            double limite,
            int saldo
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.tipoDaConta = tipoDaConta;
        this.numeroDaConta = numeroDaConta;
        this.limite = limite;
        this.saldo = saldo;
    }

    public void getDados(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Cpf: "+getCpf());
        System.out.println("Endereço: "+getEndereco());
        System.out.println("Tipo da models.Conta: "+getTipoDaConta());
        System.out.println("Número da conta: "+getNumeroDaConta());
    }

    private final List<Transacao> extrato = new ArrayList<>();

    public void setTipoDaConta(String tipoDaConta){
        this.tipoDaConta = tipoDaConta;
    }

    public String getTipoDaConta() { return tipoDaConta;}

    public String getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getNumeroDaConta(){
        return numeroDaConta;
    }

    public int getSaldo(){
        return saldo;
    }

    public double getLimite(){
        return limite;
    }

    public String toString (){
        return getTipoDaConta();
    }

    public abstract void sacar(double valor);

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        saldo += valor;
        extrato.add(new Transacao(TipoTransacao.DEPOSITO, valor, saldo));

        System.out.println("Depósito realizado: R$ " + valor);
        System.out.println("Saldo atual: R$ " + saldo);
    }

    protected void registrarSaque(double valor) {
        extrato.add(new Transacao(
                TipoTransacao.SAQUE,
                valor,
                saldo
        ));
    }


    public void mostrarExtrato() {
        if (extrato.isEmpty()) {
            System.out.println("Nenhuma transação registrada.");
            return;
        }

        for (Transacao t : extrato) {
            System.out.println( t.getDataHora() + " | " + t.getTipo() + " | R$ " + t.getValor() + " | Saldo: R$ " + t.getSaldoAposOperacao());
        }
    }











}
