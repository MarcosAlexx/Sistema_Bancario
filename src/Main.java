import models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>();

        contas.add(new ContaCorrente(
                "Marcos",
                "013.202.409-84",
                "Rua das Laranjeiras",
                "1234-0",
                1000,
                500
        ));

        contas.add(new ContaPoupanca(
                "Marcos",
                "013.202.409-84",
                "Rua das Laranjeiras",
                "5678-0",
                800
        ));

        System.out.println("Escolha a conta Desejada:");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println((i + 1) + " - " + contas.get(i));
        }

        Conta contaAtiva = contas.get(Integer.parseInt(scanner.nextLine()) - 1);

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
                case 1 -> contaAtiva.getDados();
                case 2 -> System.out.println("Saldo Atual de: R$ " + contaAtiva.getSaldo());
                case 3 -> System.out.println("Limite Atual de: R$ " + contaAtiva.getLimite());
                case 4 -> {
                    System.out.print("Valor do saque: ");
                    contaAtiva.sacar(Double.parseDouble(scanner.nextLine()));
                }
                case 5 -> {
                    System.out.print("Valor do depósito: ");
                    contaAtiva.depositar(Double.parseDouble(scanner.nextLine()));
                }
                case 6 -> contaAtiva.mostrarExtrato();
                case 7 -> {
                    System.out.println("Encerrando...");
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
