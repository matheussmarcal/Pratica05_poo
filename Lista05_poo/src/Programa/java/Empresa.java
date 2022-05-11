package Programa.java;

public class Empresa {
	
	String nome;
	String cnpj;
	int qtde_de_funcionario;
	
	
	public Empresa(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getQtde_de_funcionario() {
		return qtde_de_funcionario;
	}
	public void setQtde_de_funcionario(int qtde_de_funcionario) {
		this.qtde_de_funcionario = qtde_de_funcionario;
	}
	

}
