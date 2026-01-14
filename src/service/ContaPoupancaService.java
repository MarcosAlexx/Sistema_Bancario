package service;

import model.ContaPoupanca;
import model.TipoTransacao;
import model.Transacao;

public class ContaPoupancaService extends ContaService {

    private static final double TAXA_RENDIMENTO_MENSAL = 0.005; // 0.5% ao mês

    public void calcularRendimento(ContaPoupanca conta) {
        double saldoAtual = conta.getSaldo();
        double rendimento = saldoAtual * TAXA_RENDIMENTO_MENSAL;
        double novoSaldo = saldoAtual + rendimento;

        conta.setSaldo(novoSaldo);

        Transacao transacao = new Transacao(
                TipoTransacao.RENDIMENTO,  // Você precisaria adicionar esse tipo
                rendimento,
                novoSaldo
        );
        conta.adicionarTransacao(transacao);

        System.out.println("Rendimento creditado: R$ " + rendimento);
        System.out.println("Novo saldo: R$ " + novoSaldo);
    }

    public void simularRendimentoAnual(ContaPoupanca conta) {
        double saldoAtual = conta.getSaldo();
        double saldoFinal = saldoAtual * Math.pow(1 + TAXA_RENDIMENTO_MENSAL, 12);
        double rendimentoTotal = saldoFinal - saldoAtual;

        System.out.println("=== Simulação de Rendimento (12 meses) ===");
        System.out.println("Saldo atual: R$ " + saldoAtual);
        System.out.println("Rendimento estimado: R$ " + rendimentoTotal);
        System.out.println("Saldo final: R$ " + saldoFinal);
    }
}