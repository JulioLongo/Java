package herancas;

public class TesteReferencia {
	
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Gerente");
		g1.setSalario(200);
		
		Programador p1 = new Programador();
		p1.setNome("Programador");
		p1.setSalario(100);
		
		//
		ControllerBonificacao controle = new ControllerBonificacao();
		controle.registra(p1);
		controle.registra(g1);
		
		System.out.println(controle.getSoma());
	}
}
