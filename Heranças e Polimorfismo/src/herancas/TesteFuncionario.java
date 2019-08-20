package herancas;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario julio = new Funcionario();
		julio.setNome("Júlio");
		julio.setCpf("000.000.000-00");
		julio.setSalario(100);
		
		
		System.out.println(julio.getBonificacao());
	}
}
