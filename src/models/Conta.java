public class Conta {
    private String tipoDaConta;
    private String cpf;
    private String nome;
    private String endereco;
    private String numeroDaConta;
    private double saldo;
    private double limite;
    private double totalDepositado;
    private double totalSacado;

    public Conta(
            String nome,
            String cpf,
            String endereco,
            String tipoDaConta,
            String numeroDaConta,
            double saldo,
            double limite
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.tipoDaConta = tipoDaConta;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.limite = limite;
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

    public double getSaldo(){
        return saldo;
    }

    public double getLimite(){
        return limite;
    }

    public double getTotalDepositado(){
        return totalDepositado;
    }

    public double getTotalSacado(){
        return totalSacado;
    }


    private void meusDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Endereço: "+endereco);
        System.out.println("Tipo da Conta: "+tipoDaConta);
        System.out.println("Número da conta: "+numeroDaConta);
    }

    public void getMeusDados(){
        meusDados();
    }

    private double meuSaldo (){
        return saldo;
    }

    public void getMeuSaldo(){
        meuSaldo();
    }

   private double meuLimite (){
        return limite;
    }

    public void getMeuLimite(){
        meuLimite();
    }

    public void depositar (double valor){
        if (limite <= 1000){
            limite += valor;
            System.out.println("Depósito realizado com sucesso! Você depositou: R$:" + valor);
            System.out.println("Seu limite atual é de: R$:"+limite);
        } else {
            saldo+= valor;
            System.out.println("Depósito realizado com sucesso! Você depositou: R$:" + valor);
            System.out.println("Seu saldo atual é de: R$:"+saldo);
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
