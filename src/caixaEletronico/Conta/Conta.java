package caixaEletronico.Conta;

public class Conta {
    private String titularConta;
    private String tipoConta;
    private int numeroConta;
    private double saldoConta;
    
    public void deposito(double valorDeposito) {
        this.saldoConta += valorDeposito;
    }

    public void saque(double valorSaque) {
        this.saldoConta -= valorSaque;
    }

    public void transferencia(double valorTransferencia){
        this.saldoConta -= valorTransferencia;
    }

    public int protocoloOperacao(){
        return (int) (100000000 + (Math.random() *  (999999999 - 100000000)));
    }
    
    private void setNumeroConta() {
    		this.numeroConta = (int) (10000 + (Math.random() *  (99999 - 10000)));
    }
    
    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
        setNumeroConta();
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }
    
    public String getTitularConta() {
    	return titularConta;
    }
    
    public String getTipoConta() {
    	return tipoConta;
    }
    
    public int getNumeroConta() {
    	return numeroConta;
    }
}
