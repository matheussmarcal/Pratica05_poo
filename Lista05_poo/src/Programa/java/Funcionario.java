package Programa.java;

public class Funcionario {
	
	String nome;
	String departamento;
	double salario;
	String data;
	String RG;
	boolean status;
	
	
	public Funcionario(String nome, String departamento, double salario, String data, String rG) {
		super();
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.data = data;
		RG = rG;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
