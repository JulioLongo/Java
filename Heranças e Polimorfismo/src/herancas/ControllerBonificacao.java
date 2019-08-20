package herancas;

public class ControllerBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma = this.soma + bonificacao;
		System.out.println("Funcionario:" + f.getNome() + bonificacao);
	}
	
	public double getSoma() {
		return soma;
	}

}
