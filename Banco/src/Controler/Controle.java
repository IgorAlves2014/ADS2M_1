package Controler;

	
	import View.Menu;
	import SistemaContas.Principal;
	import SistemaContas.Especial;
	import SistemaContas.Investimentos;

	public class Controle{

		Principal conta=new Principal();
		Menu mostra=new Menu();
		Especial especial=new Especial();
		Investimentos investimentos=new Investimentos();
		
		
		void criaConta(){
					int cont=100;
					int x=0;
				do{		 
					x=mostra.menu();
				switch(x){
				case 1: //1 tipo de conta
							
					conta.setNumConta(cont);cont++;
							conta.setNumVerificacao(1);
						
								mostra.mostraConta(conta.getNumConta(), 
								
										conta.getNumVerificacao(), 0, 0);
						
						break;
						
						
				case 2: //2 tipo de conta
						
					especial.setNumConta(cont);cont++;
					especial.setNumVerificacao(2);
					conta.setNumVerificacao(x);
					especial.setLimite(500);//limite padrao R$500
					conta.setSaldo(especial.getLimite());
						
					
						mostra.mostraConta(especial.getNumConta(), 
								especial.getNumVerificacao(), 
								especial.getLimite(), 0);
						
						
						break;
						
						
				case 3://3 tipo de conta
						investimentos.setNumConta(cont);cont++;
						conta.setNumVerificacao(x);
						investimentos.setNumVerificacao(3);
						investimentos.setDataCriacao(04);
						
						
						mostra.mostraConta(investimentos.getNumConta(), 
								investimentos.getNumVerificacao(),0 , 
								investimentos.getDataCriacao());
						
						
						break;
						
						
					}

				
				}while(x>3);
		}
		
		
		void opcoes(){
					int z=0;
					while((z!=4)&&(z<5)){
						z=mostra.gerenciarConta();
				
						
				switch(z){
				case 1 ://1 Deposito
					conta.depositar(mostra.depositar());
					mostra.saldo(conta.getSaldo());
					
					break;
					
				case 2 ://2 Saldo
					conta.getSaldo();
					mostra.saldo(conta.getSaldo());
					
					break;
					
				case 3 ://3 Saque
					try {
						conta.sacar(mostra.sacar());
					
					} catch (Exception e) {
						e.printStackTrace();
						
					}
					
					mostra.saldo(conta.getSaldo());
					
					break;
					
				
				}
			}
		}
	}

