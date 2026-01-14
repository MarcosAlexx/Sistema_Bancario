package model;

public class ContaCorrente extends Conta {  // ✅ extends Conta

    public ContaCorrente(
            String nome,
            String cpf,
            String endereco,
            String numeroDaConta,
            double limite,
            double saldo
    ) {
        super(nome, cpf, endereco, "Corrente", numeroDaConta, limite, saldo);
        // ✅ Sem cast! Saldo já é double
    }

    @Override
    public void sacar(double valor) {  // ✅ Implementando método abstrato
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        if (valor > getSaldo() + getLimite()) {
            System.out.println("Saldo + limite insuficientes.");
            return;
        }

        double novoSaldo = getSaldo() - valor;
        setSaldo(novoSaldo);

        // Registrar a transação
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