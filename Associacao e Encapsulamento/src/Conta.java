
public class Conta {
	
	private double saldo;
	int agencia;
	int numero;
	private static int total;
	Cliente titular = new Cliente();
	
	public Conta(int agencia, int numero) {
		super();
		Conta.total++;
		//System.out.println("Total de Contas é:" + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
	}

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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if( numero <= 0) {
			System.out.println("Não pode ser menor que 0");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}
	
	
	
	
	
}
