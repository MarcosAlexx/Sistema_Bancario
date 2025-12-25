package models;

public abstract class Conta extends Transacoes {
    private String tipoDaConta;
    private String cpf;
    private String nome;
    private String endereco;
    private String numeroDaConta;

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


    public String getTipoDaConta(){
        return tipoDaConta;
    }

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

    public abstract void sacar(double valor);

    public abstract void getDados();

}
