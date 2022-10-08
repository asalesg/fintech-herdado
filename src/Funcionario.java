//não pode instanciar criar obj dessa classe pq é abstrata.
//precisa criar uma não abstrata filha pra criar
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	
	//metodo sem corpo. não há implemenção.
	//Só os filhos usam.((OBRIGATORIAMENTE)) ele se adpata a cada filho
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
