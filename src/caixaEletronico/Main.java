package caixaEletronico;

import caixaEletronico.Conta.Conta;
import caixaEletronico.dashboard.InterfaceTerminal;
import caixaEletronico.operacoes.Validacoes;

import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
    	Conta usuario = new Conta();
        InterfaceTerminal interfaceTerminal = new InterfaceTerminal();
        Validacoes validacoes = new Validacoes();
        Scanner scannerNum = new Scanner(System.in);
        Scanner scannerTxt = new Scanner(System.in);
        
        boolean finaliza = false, validaResposta;
        int repeticoes = 0, operacao = 0, totRepeticoes;
        String tipoConta;
        
        while (!finaliza) {
        		
        	if (repeticoes == 0) {
        		interfaceTerminal.painelPrincipal();
        		
        		interfaceTerminal.painelNomeCliente();
        		usuario.setTitularConta(scannerTxt.nextLine());
        		
        		validaResposta = false;
        		totRepeticoes = 0;
        		do {
        			if (totRepeticoes >=1) {
        				interfaceTerminal.painelErroTipoCinta();
        			}
        		
        			interfaceTerminal.painelTipoConta();
        			tipoConta = scannerTxt.nextLine();
        			validaResposta = validacoes.validaTipoConta(tipoConta);
        			totRepeticoes++;
        			
        		}while(!validaResposta);
        		
        		usuario.setTipoConta(tipoConta);
        		
        		validaResposta = false;
        		totRepeticoes = 0;
        		double valorDeposito = 0;
        		do {
        				
        			if (totRepeticoes >= 1) {
        				interfaceTerminal.painelErroDeposito();
        			}
        			interfaceTerminal.depositoInicial();
        			valorDeposito = scannerNum.nextDouble();
        			validaResposta = validacoes.validaDeposito(valorDeposito);
        			totRepeticoes++;
        		}while(!validaResposta);
        		
        		usuario.deposito(valorDeposito);
        		
        		interfaceTerminal.painelPrincipal();
        		interfaceTerminal.painelInformacoesUsuario(usuario.getTitularConta(), usuario.getNumeroConta(), usuario.getTipoConta());
        		
    	        repeticoes++;
    	        
        	}else {
        		
        		validaResposta = false;
        		totRepeticoes = 0;
        		do {
        			if (totRepeticoes >=1) {
        				interfaceTerminal.painelOperacaoInvalida();
        				interfaceTerminal.painelOperacao();
                		operacao = scannerNum.nextInt();
        			}
        			
        			interfaceTerminal.painelConsultaSaldo(usuario.getSaldoConta());
        			interfaceTerminal.painelOperacao();
            		operacao = scannerNum.nextInt();
        			validaResposta = validacoes.validaOperacao(operacao);
        			totRepeticoes++;
        			
        		}while(!validaResposta);
        		
        		switch (operacao) {
	        	    case 1:
	        	    	interfaceTerminal.painelDeposito();
	        	    	
	        	    	do {
	        	    		if (totRepeticoes >=1) {
	        	    			interfaceTerminal.painelErroDeposito();
	        	    		}
	        	    		
	        	    		totRepeticoes++;
	        	    		
	        	    	}while(!validaResposta);
	        	    	
	        	    	double deposito = scannerNum.nextDouble();
	        	    	usuario.deposito(deposito);
	        	        break;
	        	    case 2:
	        	    	interfaceTerminal.painelSaque();
	        	    	double saque = scannerNum.nextDouble();
	        	    	usuario.saque(saque);
	        	        break;
	        	    case 3:
	        	    	interfaceTerminal.painelTransferencia();
	        	    	double transferencia = scannerNum.nextDouble();
	        	    	usuario.transferencia(transferencia);
	        	        break;
	        	    default:
	        	    	finaliza = true;
	        	        break;
        	        
        		}
        	}  
        
        }
        interfaceTerminal.painelFinalização();
        scannerNum.close();
    	scannerTxt.close();
    }
    
}