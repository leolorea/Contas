package beans;

public class Cliente {
	
	private String nome;
	private String enderešo;
	private String cpf;
	private String rg;
	
	
	public Cliente(String nome, String enderešo, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.enderešo = enderešo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}
	
}


