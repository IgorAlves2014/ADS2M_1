package SistemaContas;

public class Principal {
	
	private double saldo;
	private int numConta;
	private int numVerificacao;
	//.................................................
	public void depositar(double valor){
		double novo_valor=saldo+valor;
		saldo=novo_valor;
	}
	//.................................................
	public void sacar(double valor) throws Exception  {
		if(saldo<valor){
			throw new Exception ("Saldo insuficiente");  
		}
		if(saldo>=valor){
			double novo_saldo=saldo-valor;
			saldo=novo_saldo;
		}
	}
	//.................................................
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getNumVerificacao() {
		return numVerificacao;
	}
	public void setNumVerificacao(int numVerificacao) {
		this.numVerificacao = numVerificacao;
	}

}
