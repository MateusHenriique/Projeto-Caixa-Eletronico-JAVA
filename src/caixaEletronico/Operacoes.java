package caixaEletronico;

public class Operacoes {

    public static double deposito (double saldoCliente, double valorDeposito){
        return (saldoCliente + valorDeposito);
    }

    public static double saque (double saldoCliente, double valorSaque){
        return (saldoCliente - valorSaque);
    }

    public static double transferencia (double saldoCliente, double valorTransferencia){
        return (saldoCliente - valorTransferencia);
    }

    public static int protocoloOperacao(){
        return (int) (Math.random() * 1000000);
    }
}
