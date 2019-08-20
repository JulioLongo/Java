package herancas;

public class testeGerente {
	public static void main(String[] args) {
		Gerente jubs = new Gerente();
		
		//Insire variaveis de funcionario
		jubs.setNome("Julio");
		jubs.setSalario(500);
		System.out.println(jubs.getNome());
		
		jubs.setSenha(123);
		boolean autenticou = jubs.autentica(123);
		System.out.println(autenticou);
		
		//teste bonificação
		System.out.println(jubs.getBonificacao());
	}
}
