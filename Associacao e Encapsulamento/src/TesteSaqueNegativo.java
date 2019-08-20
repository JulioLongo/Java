
public class TesteSaqueNegativo {
	
	
	public static void main(String[] args) {
		Conta conta = new Conta(123, 456);
		conta.deposita(100);
		
		//Tenta sacar com valor negativo
		System.out.println(conta.saca(150));
		System.out.println(conta.getSaldo());
		
		//Cria novo cliente
		Cliente paulo = new Cliente();
		paulo.nome = "paulo";
		
		//Associa conta ao cliente paulo;
		conta.setTitular(paulo);
		
		//Define profissao
		conta.getTitular().setProfissao("Programador");
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getProfissao());
		
		//Tenta colocar número negativo na conta
		conta.setNumero(-1);
	}
}
