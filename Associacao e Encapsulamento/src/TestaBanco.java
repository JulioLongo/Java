
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta(123, 456);
		contaDoPaulo.deposita(100);
		
		//Associa o cliente paulo a conta
		contaDoPaulo.titular = paulo;
		System.out.println("Titular: " + contaDoPaulo.titular.nome);
		System.out.println("CPF: " + contaDoPaulo.titular.cpf);
		System.out.println("Profissão: " + contaDoPaulo.titular.profissao);
	}
}
