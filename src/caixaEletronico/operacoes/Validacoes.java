package caixaEletronico.operacoes;

public class Validacoes {

    public boolean validaTipoConta(String tipoDeConta) {
        if (!tipoDeConta.equals("corrente") && !tipoDeConta.equals("poupanca")) {
            return false;
        }else {
            return true;
        }
       
    }
    
    public boolean validaOperacao(int operacao) {
    	
    	if (operacao <=0 && operacao > 4) {
    		return false;
    	}else {
    		return true;
    	}
   
    }
    
    public boolean validaDeposito(double valorDeposito) {
    	if (valorDeposito <= 0) {
    		return false;
    	}else {
    		return true;
    	}
    }
}
