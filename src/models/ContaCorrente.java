package models;

public class ContaCorrente extends Conta {

    public ContaCorrente(
            String nome,
            String cpf,
            String endereco,
            String numeroDaConta,
            double limite,
            int saldo
    )  {
        super(nome, cpf, endereco, "Corrente", numeroDaConta, limite, saldo);
    }

    public void getDados(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Cpf: "+getCpf());
        System.out.println("Endereço: "+getEndereco());
        System.out.println("Tipo da models.Conta: "+getTipoDaConta());
        System.out.println("Número da conta: "+getNumeroDaConta());
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("\nSaque realizado com sucesso! Você sacou: R$:" + valor );
            System.out.println("Seu saldo atual é de: R$:" + saldo);
        } else {
            System.out.println("Saldo + limite insuficientes");
        }
    }
}
