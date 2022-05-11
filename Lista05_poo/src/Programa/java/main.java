package Programa.java;

public class main {

	public static void main(String[] args) {
		
		Pessoa p0 = new Pessoa ("Pedro", 1.69f, 75f);
		
		Pessoa [] pessoas = new Pessoa [10];
		
		Pessoa p1 = new Pessoa ("Joao", 1.75f, 70f);
		Pessoa p2 = new Pessoa ("Maria", 1.65f, 60f);
		Pessoa p3 = new Pessoa ("José", 1.70f, 65f);
		Pessoa p4 = new Pessoa ("Ana", 1.60f, 62f);
		Pessoa p5 = new Pessoa ("Thaís", 1.68f, 68f);
		Pessoa p6 = new Pessoa ("Anne", 1.64f, 66f);
		Pessoa p7 = new Pessoa ("Marcelo", 1.76f, 72f);
		Pessoa p8 = new Pessoa ("Marianna", 1.72f, 63f);
		Pessoa p9 = new Pessoa ("Michelle", 1.67f, 60f);
		Pessoa p10 = new Pessoa ("Matheus", 1.74f, 73f);
		
		for (int i=0;i<10;i++) {
			
			System.out.println(pessoas [i].imprimir ());
		}

		Funcionario [] funcionarios = new Funcionario [100];
	}

}
