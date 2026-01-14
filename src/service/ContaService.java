package service;

import model.Conta;
import model.TipoTransacao;
import model.Transacao;

public class ContaService {

    public void exibirDados(Conta conta) {
        System.out.println("=== Dados da Conta ===");
        System.out.println("Nome: " + conta.getNome());
        System.out.println("CPF: " + conta.getCpf());
        System.out.println("Endereço: " + conta.getEndereco());
        System.out.println("Tipo da Conta: " + conta.getTipoDaConta());
        System.out.println("Número da conta: " + conta.getNumeroDaConta());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }

    public void depositar(Conta conta, double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        double novoSaldo = conta.getSaldo() + valor;
        conta.setSaldo(novoSaldo);

        Transacao transacao = new Transacao(
                TipoTransacao.DEPOSITO,
                valor,
                novoSaldo
        );
        conta.adicionarTransacao(transacao);

        System.out.println("Depósito realizado: R$ " + valor);
        System.out.println("Saldo atual: R$ " + novoSaldo);
    }

    public void registrarSaque(Conta conta, double valor) {
        Transacao transacao = new Transacao(
                TipoTransacao.SAQUE,
                valor,
                conta.getSaldo()
        );
        conta.adicionarTransacao(transacao);
    }

    public void mostrarExtrato(Conta conta) {
        if (conta.getExtrato().isEmpty()) {
            System.out.println("Nenhuma transação registrada.");
            return;
        }

        System.out.println("=== Extrato ===");
        for (Transacao t : conta.getExtrato()) {
            System.out.println(
                    t.getDataHora() + " | " +
                            t.getTipo() + " | R$ " +
                            t.getValor() + " | Saldo: R$ " +
                            t.getSaldoAposOperacao()
            );
        }
    }
}