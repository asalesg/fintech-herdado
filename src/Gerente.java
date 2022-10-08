//significa: gerente é um funcionario que tem isso de diferente
//ou seja é uma extensão de funcionario com isso a mais e assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	public double getBonificacao() {
		System.out.println("chamando o metodo boni do gerente");
		return super.getSalario();
	}
	private AutenticaUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticaUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
