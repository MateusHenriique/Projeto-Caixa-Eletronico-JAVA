package caixaEletronico;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Operacoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("      C A I X A    E L E T R O N I C O       ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Digite o nome do Cliente: ");
        String nomeCliente = input.nextLine();
        String tipoDeConta = "";
        int i = 0;
        do {
            if (i == 0) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.print("Tipo de conta: [Corrente ou Poupanca]");
                tipoDeConta = input.nextLine().toLowerCase();
                i++;
            }else {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("O tipo de conta digitado é invalido. tente novamente: ");
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.print("Tipo de conta: [Corrente ou Poupanca]");
                tipoDeConta = input.nextLine().toLowerCase();
            }

        }while(!tipoDeConta.equals("corrente") && !tipoDeConta.equals("poupanca"));

        if (tipoDeConta.equals("corrente")) {

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("Saldo inicial: ");
            double saldoCliente = inputNum.nextDouble();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            int operacao = 0;

            while (operacao != 4) {

                System.out.print("\033c");
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.printf("""
                Nome do cliente: %s
                Tipo de conta: %s
                saldo Disponivel: R$%.2f
                """, nomeCliente, tipoDeConta, saldoCliente);
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

                System.out.println("Selecione a operação desejada; ");
                System.out.println("""
                [1] Deposito
                [2] Saque
                [3] transferencia
                [4] Sair
                """);
                operacao = inputNum.nextInt();
                switch (operacao) {
                    case 1:
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.print("Digite o valor do deposito: R$");
                        double valorDeposito = inputNum.nextDouble();
                        saldoCliente = deposito(saldoCliente, valorDeposito);
                        System.out.printf("""
                        Deposito realizado com sucesso.
                        Voce depositou R$%.2f
                        %n""", valorDeposito);
                        break;
                    case 2:
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.println("Digite o valor do saque: R$");
                        double valorSaque = inputNum.nextDouble();
                        saldoCliente = saque(saldoCliente, valorSaque);
                        System.out.printf("""
                        Saque realizado com sucesso.
                        Voce Sacou R$%.2f
                        %n""", valorSaque);
                        break;
                    case 3:
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.print("digite o nome do destinatario: ");
                        String nomeDestinatario  = input.nextLine();
                        System.out.print("Digite o numero da conta do destinatario:");
                        int contaDestinatario = inputNum.nextInt();
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.print("Digite o valor da transferencia: R$");
                        double valorTransferencia = inputNum.nextDouble();
                        saldoCliente = transferencia(saldoCliente, valorTransferencia);
                        int protocoloOperacao = protocoloOperacao();
                        System.out.printf("""
                        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                        Trasnferencia para %s realizado com sucesso.
                        numero da conta do destinatario: %s
                        Valor transferido: R$%.2f
                        Protocolo da transferencia: #%d
                        %n""", nomeDestinatario, contaDestinatario, valorTransferencia, protocoloOperacao);
                        break;
                    case 4:
                        System.out.println("""
                        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                        Obrigado por utilizar nosso sistema.
                        Finalizando o programa.
                        """);
                        break;
                    default:
                        System.out.println("""
                        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                        A operação digitada esta invalida
                        Pro favor tente novamente.
                        """);
                }
            }

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        }else {
            System.out.println("sla");
        }

    }
}