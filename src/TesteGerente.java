
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel gerenteReferencia = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("André Sales");
		g1.setCpf("35535535508");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());
		
		g1.setSenha(2222);
		
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());

	}

}
