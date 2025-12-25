//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import models.Conta;
import models.ContaCorrente;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta contaBancaria = new ContaCorrente(
                "Marcos",
                "013.202.409-84",
                "Rua das laranjeiras - 435",
                "43256-0",
                1000,
                500
        );

        String nome = contaBancaria.getNome();
        String cpf = contaBancaria.getCpf();
        String endereco = contaBancaria.getEndereco();
        String tipoDaConta = contaBancaria.getTipoDaConta();
        String numeroDaConta = contaBancaria.getNumeroDaConta();



        while(true) {
            System.out.println("\nEscolha uma das 6 operações: \n1- Meu Dados\n2- Consultar meu saldo\n3- Consultar meu limite\n4- Realizar um saque\n5- Realizar um Depósito\n6- Sair");
            int opcao = Integer.parseInt(scanner.nextLine());
            if (opcao == 1){
                contaBancaria.getDados();
            }else if (opcao == 2) {
                System.out.println("Seu Saldo atual é: R$" + contaBancaria.getSaldo());
            } else if (opcao == 3) {
                System.out.println("Seu limite atual é: R$" + contaBancaria.getLimite());
            }else if (opcao == 4) {
                System.out.println("Quanto você deseja Sacar ?");
                int saque = Integer.parseInt(scanner.nextLine());
                contaBancaria.sacar(saque);
            }else if (opcao == 5) {
                System.out.println("Quanto você deseja depositar ?");
                int deposito = Integer.parseInt(scanner.nextLine());
                contaBancaria.depositar(deposito);
            }else if (opcao == 6) {
                System.out.println("Obrigado pela confiança! Volte sempre. ");
                break;
            }else{
                System.out.println("Sentimos muito, operação inválida! ");
            }

        }

    }
}