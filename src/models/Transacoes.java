package models;

public class Transacoes {

    protected int saldo;
    protected double limite;

    public int getSaldo(){
        return saldo;
    }

    public double getLimite(){
        return limite;
    }

    public void depositar (double valor){
        if (limite < 1000){
            limite += valor;
            System.out.println("Depósito realizado com sucesso! Você depositou: R$:" + valor);
            System.out.println("Seu limite atual é de: R$:"+ limite);
        } else {
            saldo+= valor;
            System.out.println("Depósito realizado com sucesso! Você depositou: R$:" + valor);
            System.out.println("Seu saldo atual é de: R$:"+ saldo);
        }
    }

    public void sacar (double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("\nSaque realizado com sucesso! Você sacou: R$:" + valor );
            System.out.println("Seu saldo atual é de: R$:" + saldo);
        } else if(valor > saldo){
            limite -= valor;
            System.out.println("\nVocê utilizou seu limite da conta! Você sacou: R$:" + valor );
            System.out.println("Seu limite atual é de: R$:" + limite);
        }
    }
}
