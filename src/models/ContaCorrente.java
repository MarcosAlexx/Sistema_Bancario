package models;

public class ContaCorrente extends Conta {

    public ContaCorrente(
            String nome,
            String cpf,
            String endereco,
            String numeroDaConta,
            double limite,
            double saldo
    ) {
        super(nome, cpf, endereco, "Corrente", numeroDaConta, limite, (int) saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0 || valor > saldo + limite) {
            System.out.println("Saldo + limite insuficientes.");
            return;
        }

        saldo -= valor;
        registrarSaque(valor);

        System.out.println("Saque realizado: R$ " + valor);
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
