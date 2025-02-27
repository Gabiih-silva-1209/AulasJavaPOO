package exercício05Encapsulamento02;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroConta {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String menu = """
                _____________________________________________________________________
                |   Escolha uma Opção:                                              |
                |       1- Cadastrar conta                                          |
                |       2- Listar contas                                            |
                |       3- Depositar                                                |
                |       4- Sacar                                                    |
                |       5- Sair                                                     |
                |___________________________________________________________________|
                """;
        int opcao;

        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarConta(contas, scanner);
                    break;

                case 2:
                    listarContas(contas);
                    break;

                case 3:
                    depositar(contas, scanner);
                    break;
                case 4:
                    sacar(contas, scanner);
                    break;

                case 5:
                    System.out.println("Sair");
                    break;

                default:
                    System.out.println("Opção inválida!!!");
            }
        } while (opcao != 5);

        scanner.close();
    }

    public static void cadastrarConta(ArrayList<ContaBancaria> contas, Scanner scanner) {
        System.out.println("Digite  o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        contas.add(new ContaBancaria(titular, saldo));
        System.out.println("Conta cadastrada com sucesso!!!");

    }

    public static void listarContas(ArrayList<ContaBancaria> contas) {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            System.out.println("Lisra de Contas: ");
            for (ContaBancaria conta : contas) {
                System.out.println("Titular: " + conta.getTitular() + ", Saldo: R$ " + conta.getSaldo());

            }
        }
    }

    public static void depositar(ArrayList<ContaBancaria> contas, Scanner scanner) {
        System.out.println("Digite  o nome do titular: ");
        String titular = scanner.nextLine();
        System.out.println("Digite  o valor do depósito: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        for (ContaBancaria conta : contas) {
            if (conta.getTitular().equals(titular)) {
                conta.depositar(valor);
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    public static void sacar(ArrayList<ContaBancaria> contas, Scanner scanner) {
        System.out.println("Digite  o nome do titular: ");
        String titular = scanner.nextLine();
        System.out.println("Digite  o valor do saque: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        for (ContaBancaria conta : contas) {
            if (conta.getTitular().equals(titular)) {
                conta.sacar(valor);
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }
}

