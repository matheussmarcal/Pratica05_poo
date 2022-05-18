package Programa.java;

public class main {

	public static void main(String[] args) {
		
		Pessoa p0 = new Pessoa ("Pedro", 1.69f, 75f, 29);
		
		Pessoa [] pessoas = new Pessoa [10];
		
		Pessoa p1 = new Pessoa ("Joao", 1.75f, 70f, 25);
		Pessoa p2 = new Pessoa ("Maria", 1.65f, 60f, 20);
		Pessoa p3 = new Pessoa ("José", 1.70f, 65f, 21);
		Pessoa p4 = new Pessoa ("Ana", 1.60f, 62f, 22);
		Pessoa p5 = new Pessoa ("Thaís", 1.68f, 68f, 23);
		Pessoa p6 = new Pessoa ("Anne", 1.64f, 66f, 24);
		Pessoa p7 = new Pessoa ("Marcelo", 1.76f, 72f, 26);
		Pessoa p8 = new Pessoa ("Marianna", 1.72f, 63f, 27);
		Pessoa p9 = new Pessoa ("Michelle", 1.67f, 60f, 28);
		Pessoa p10 = new Pessoa ("Matheus", 1.74f, 73f, 29);
		
		for (int i=0;i<10;i++) {
			
			//System.out.println(pessoas [i].imprimir ());
		}

		Funcionario [] funcionarios = new Funcionario [100];
		
		Funcionario f1 = new Funcionario("Marcelo", "d1", 2000, "17/05/2022", "123", true);
		Funcionario f2 = new Funcionario("Marcelo", "d1", 2000, "17/05/2022", "123", true);
		
		if (f1==f2) 
			System.out.println("Funcionários iguais");
		else
			System.out.println("Diferente");
		
		p1.aniversario();
		p1.aniversario();
		p1.aniversario();
		p1.imprimir();
		}
}
