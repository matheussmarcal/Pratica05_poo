package Programa.java;

public class Funcionario {
	
	String nome;
	String departamento;
	double salario;
	String data;
	String RG;
	boolean status;
	
	
	
	public Funcionario(String nome, String departamento, double salario, String data, String rG,boolean status) {
		super();
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.data = data;
		RG = rG;
		this.status = status;
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
	
	public void bonificar (double bonus) {
		this.setSalario(this.getSalario()+bonus);
	}
	public void demitir() {
		this.setStatus(false);
	}
	public void mostrarDados () {
		System.out.println("Nome:" + this.getNome());
		System.out.println("Departamento:" + this.getDepartamento());
		System.out.println("Salário:" + this.getSalario());
		System.out.println("Data de entrada:" + this.getData());
		System.out.println("RG:" + this.getRG());
		System.out.println("Funcionário ativo?:" + this.status);
	}

}
