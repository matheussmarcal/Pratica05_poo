package Programa.java;

public class Pessoa {
	
	String nome;
	float altura;
	float peso;
	public Pessoa(String nome, float altura, float peso) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
public String imprimir() {
	return "Nome: "+ nome + "\n Peso: "+ peso + "\n Altura: "+ altura;
}
