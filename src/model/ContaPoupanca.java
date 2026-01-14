package model;
import service.ContaService;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(
            String nome,
            String cpf,
            String endereco,
            String numeroDaConta,
            int saldo
    ) {
        super(nome, cpf, endereco, "Poupança", numeroDaConta, 0, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        if (valor > getSaldo()) {  // ✅ Poupança não usa limite
            System.out.println("Saldo insuficiente.");
            return;
        }

        double novoSaldo = getSaldo() - valor;
        setSaldo(novoSaldo);

        Transacao transacao = new Transacao(
                TipoTransacao.SAQUE,
                valor,
                novoSaldo
        );
        adicionarTransacao(transacao);

        System.out.println("Saque realizado: R$ " + valor);
        System.out.println("Saldo atual: R$ " + novoSaldo);
    }
}
