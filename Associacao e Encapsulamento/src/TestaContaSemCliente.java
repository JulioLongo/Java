
public class TestaContaSemCliente {

	public static void main(String[] args) {
		//Cria conta
		Conta contaMarcela = new Conta(123, 456);
		Conta contaJubs = new Conta(123, 456);
		
		//Associa com a classe cliente
		contaMarcela.titular.nome = "Marcela";
		System.out.println(contaMarcela.titular.nome);
		
		System.out.println("Total de Contas" + Conta.getTotal());
	}
}
