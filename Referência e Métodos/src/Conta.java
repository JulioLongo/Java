
public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;

	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		//remove o dinheiro da conta
		if(this.saldo >= valor) {
			this.saldo -= valor;
			
			//adiciona dinheiro na outra conta
			destino.deposita(valor); 
			return true;
		} else {
			return false;
		}
		
	}
	
	
}
