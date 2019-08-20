
public class TestaMetodo {
	
	public static void main(String[] args) {
		 Conta contaJulio = new Conta();
		 contaJulio.saldo = 100;
		 
		 //Deposita
		 contaJulio.deposita(50);
		 System.out.println(contaJulio.saldo);
		 
		 //Retira
		 boolean conseguiuRetirar = contaJulio.saca(160);
		 System.out.println(contaJulio.saldo);
		 System.out.println(conseguiuRetirar);
		 
		 //Trasfere
		 Conta contaNath = new Conta();
		 contaNath.deposita(1000);
		 
		 boolean estadoTransferencia = contaNath.transfere(600, contaJulio);
		 
		 //Teste se possui dinheiro
		 if(estadoTransferencia) {
			 System.out.println("sucesso");
		 }else {
			 System.out.println("falhou");
		 }
		 
		 
		 System.out.println(contaNath.saldo);
		 System.out.println(contaJulio.saldo);
		 contaJulio.titular = "julio andrade";
	}
}
