
public class CriarConta {

	public static void main(String[] args) {
		
		//Primeira conta
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.saldo += 300;
		
		System.out.println(primeiraConta.saldo);
		
		//Segunda conta
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		
		//
		if(primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		}else {
			System.out.println("conta diferente");
		}
		
	}
}
