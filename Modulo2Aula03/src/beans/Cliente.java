package beans;

public class Cliente {
	
	private String nome;
	private String endere�o;
	private String cpf;
	private String rg;
	
	
	public Cliente(String nome, String endere�o, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endere�o = endere�o;
	}
	
	
	public String getNome() {
		return nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}
	
}


