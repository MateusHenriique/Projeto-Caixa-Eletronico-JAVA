package caixaEletronico.dashboard;

public class InterfaceTerminal {

    public void painelPrincipal() {
        System.out.println("""
             -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                     C A I X A    E L E T R O N I C O
             -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
             """);
    }

    public void painelNomeCliente() {
        System.out.print("Digite o nome do Cliente: ");
    }

    public void painelTipoConta() {
    	System.out.print("""
    		-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    		Tipo de conta: [Corrente ou Poupanca]: 
    		""");
    }
    
    public void painelErroTipoCinta() {
    	System.out.println("""
    		-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    		O tipo de conta digitado é invalido. tente novamente: 
    		""");
    }

    public void depositoInicial() {
        System.out.print("""
        	-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        	deposito inicial:
        	""");
    }
    
    public void painelConsultaSaldo(double saldoCliente) {
    	System.out.println("""	
    		-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    		Saldo Disponivel: R$%.2f
    		""".formatted(saldoCliente));
    }
    
    public void painelInformacoesUsuario(String titularConta, int numeroConta, String tipoConta) {
    	System.out.println("""
    			-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    			Nome do titular da conta: %s
    			Numero da Conta: %d
    			Tipo de conta: %s
    			""".formatted(titularConta, numeroConta, tipoConta));
    }

    public void painelOperacao() {
        System.out.println("""
	        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
	        Selecione a operação desejada; ");
	        [1] Deposito
	        [2] Saque
	        [3] transferencia
	        [4] Sair
	        """);
    }
    
    public void painelOperacaoInvalida() {
    	System.out.println("""
    		-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    	    A operação digitada esta invalida
    	    Pro favor tente novamente.
    	    """);
    }
    
    public void painelDeposito() {
    	System.out.println("""
    		-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    		Digite o valor do deposito: R$
    		""");
    }
    
    public void painelErroDeposito() {
    	System.out.println("""
            	-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            	O valor de deposito inicial solicitado é invalido. tente novamente:
            	""");
    }
    
    public void painelDepositoFinalizado(double valorDeposito, int valorOperacao) {
    	System.out.printf("""
    		-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-s
        	Deposito realizado com sucesso.
        	Voce depositou R$%.2f
        	Protocolo da operacao: #%d
        	""");
    }
    
    public void painelSaque(){
    	System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Digite o valor do saque: R$");
    	
    }
    
    public void painelSaqueFinalizado() {
    	System.out.print("""
        		-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        		Saque realizado com sucesso.
        		Voce Sacou R$%.2f
        		Protocolo da operacao: #%d
        		""");
    }
    
    public void painelTransferencia(){
        System.out.println("""
        		-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        		Digite o valor da transferencia: R$
        		""");
    }
    
    public void painelDestinatarioTransferencia() {
    	System.out.print("""
    			-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    			Digite o numero da conta do destinatario:
    			""");
    }
    public void painelContaDestinatarioTransferencia() {
    	System.out.print("""
    			-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    			Digite o numero da conta do destinatario:
    			""");
    }
    
    public void painelTransferenciaFinalizada() {
    	System.out.printf("""
    	        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    	        Trasnferencia para %s realizado com sucesso.
    	        numero da conta do destinatario: %s
    	        Valor transferido: R$%.2f
    	        Protocolo da operacao: #%d
    	        """);
    }
    
    public void painelFinalização() {
    	System.out.println("""
    	        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    	        Obrigado por utilizar nosso sistema.
    	        Finalizando o programa.
    	        """);
    	
    }

}
