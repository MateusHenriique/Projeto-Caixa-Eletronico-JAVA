package caixaEletronico.operacoes;

import caixaEletronico.Conta.Conta;

public class Operacoes {

    public double deposito(double saldoConta, double valorDeposito) {
        return (saldoConta + valorDeposito);
    }

    public double saque(double saldoConta, double valorSaque) {
    	return (saldoConta - valorSaque);
    }

    public double transferencia(double saldoConta, double valorTransferencia){
    	return (saldoConta + valorTransferencia);
    }

    public int protocoloOperacao(){
        return (int) (Math.random() * 1000000);
    }
}
