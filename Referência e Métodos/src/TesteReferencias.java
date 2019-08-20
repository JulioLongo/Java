
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira " + primeiraConta.saldo);
		
		//Referenciar a primeira conta
		Conta segundaConta = primeiraConta;	
		System.out.println("saldo da segunda conta "+ segundaConta.saldo);
		
		//Teste referencia atualizando os dois valores
		segundaConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);	
		
		if(primeiraConta == segundaConta) {
			System.out.println("É a mesma conta");
		}
		
	}
}
