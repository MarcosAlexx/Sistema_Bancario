package models;

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

    public void getDados(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Cpf: "+getCpf());
        System.out.println("Endereço: "+getEndereco());
        System.out.println("Tipo da models.Conta: "+getTipoDaConta());
        System.out.println("Número da conta: "+getNumeroDaConta());
    }

    public void sacar (double valor){
        if (valor < saldo){
            saldo -= valor;
            System.out.println("\nSaque realizado com sucesso! Você sacou: R$:" + valor );
            System.out.println("Seu saldo atual é de: R$:" + saldo);
        } else {
            System.out.println("Saldo Insuficiente! ");
        }
    }
}
