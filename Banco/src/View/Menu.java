package View;
import java.util.*;

public class Menu {
	

		Scanner leia=new Scanner(System.in);
		
		
		public int menu(){
			System.out.println("Escolha:" +
					"\n1 - Criar conta comum" +
					"\n2 - Criar conta especial" +
					"\n3 - Criar conta investimento" 
					
					);
					int x=leia.nextInt();
			return x;
		}
		
		
		public int gerenciarConta(){
			System.out.println( "\n1 - DEPOSITO" +
								"\n2 - SALDO CONTA" +
								"\n3 - SAQUE" +
								"\n4 - FINALIZAR" );
			int y=leia.nextInt();
			return y;
		}
		
		
		public void mostraConta(int conta, int verificacao, 
									double limite, int data){
			System.out.println("________________" +
								"\nConta: "+conta+
								"\nVerificação: "+verificacao+
								"\nLimite: "+limite+
								"\nInicio de Investimento :"+data+
								"\n________________");
		}
		
		
		
		public double depositar(){
			System.out.println("QUAL VALOR DO SEU DEPOSITO:");
				double valor=leia.nextDouble();
			return valor;
		}
		
		
		public void saldo(double saldo){
			System.out.println("SALDO: R$ "+saldo);
		}
		
		
		
		public double sacar(){
			System.out.println("QUAL O VALOR DO SEU SAQUE:");	
			double saque=leia.nextDouble();
			return saque;
		}


	}


