package herancas;

public class Programador extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Bonificao de Programador:");
		return super.getBonificacao() + 200;
		
	}
}
