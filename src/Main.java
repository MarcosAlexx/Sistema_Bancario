import models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>();

        contas.add(new ContaCorrente(
                "Marcos",
                "111.111.111-11",
                "Rua dos testes",
                "1234-0",
                1000,
                500
        ));

        contas.add(new ContaPoupanca(
                "Marcos",
                "111.111.111-11",
                "Rua dos testes",
                "5678-0",
                800
        ));

        System.out.println("Escolha a conta Desejada:");

        for (int i = 0; i < contas.size(); i++) {
            System.out.println((i + 1) + " - " + contas.get(i));
        }

        Conta conta = contas.get(Integer.parseInt(scanner.nextLine()) - 1);

        System.out.println("Selecione uma das opções para continuarmos: \n");

        while (true) {
            System.out.println("""
                1 - Dados
                2 - Saldo
                3 - Limite
                4 - Sacar
                5 - Depositar
                6 - Extrato
                7 - Sair
                """);

            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> conta.getDados();
                case 2 -> System.out.println("Saldo Atual de: R$ " + conta.getSaldo());
                case 3 -> System.out.println("Limite Atual de: R$ " + conta.getLimite());
                case 4 -> {
                    System.out.print("Valor do saque: ");
                    conta.sacar(Double.parseDouble(scanner.nextLine()));
                }
                case 5 -> {
                    System.out.print("Valor do depósito: ");
                    conta.depositar(Double.parseDouble(scanner.nextLine()));
                }
                case 6 -> conta.mostrarExtrato();
                case 7 -> {
                    System.out.println("Encerrando...");
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
