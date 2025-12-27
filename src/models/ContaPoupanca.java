package models;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(
            String nome,
            String cpf,
            String endereco,
            String numeroDaConta,
            double saldo
    ) {
        super(nome, cpf, endereco, "Poupança", numeroDaConta, 0, (int) saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        saldo -= valor;
        registrarSaque(valor);

        System.out.println("Saque realizado: R$ " + valor);
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
