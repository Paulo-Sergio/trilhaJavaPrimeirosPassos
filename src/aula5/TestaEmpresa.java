package aula5;

public class TestaEmpresa {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa("123456789-123");
		//empresa.setEmpregados(new Funcionario[10]); j� fiz no construtor

		Funcionario f1 = new Funcionario();
		f1.setNome("Paulo");
		f1.setSalario(1000);
		Funcionario f2 = new Funcionario();
		f2.setNome("Kelly");
		f2.setSalario(600);
		Funcionario f3 = new Funcionario();
		f3.setNome("Guilherme");
		f3.setSalario(850);
		
		empresa.adiciona(f1);
		empresa.adiciona(f2);
		empresa.adiciona(f3);
		
		//empresa.empregados[0].mostra();
		//empresa.empregados[1].mostra();
		//empresa.empregados[2].mostra();
		
		empresa.mostraSalarios();
		System.out.println("-------------------------------");
		empresa.mostraEmpregados();
	}

}
