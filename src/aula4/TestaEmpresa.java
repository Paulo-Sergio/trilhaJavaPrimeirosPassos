package aula4;

public class TestaEmpresa {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];

		Funcionario f1 = new Funcionario();
		f1.nome = "Paulo";
		f1.salario = 1000;
		Funcionario f2 = new Funcionario();
		f2.nome = "Kelly";
		f2.salario = 600;
		Funcionario f3 = new Funcionario();
		f3.nome = "Guilherme";
		f3.salario = 850;
		
		empresa.adiciona(f1);
		empresa.adiciona(f2);
		empresa.adiciona(f3);
		
		//empresa.empregados[0].mostra();
		//empresa.empregados[1].mostra();
		//empresa.empregados[2].mostra();
		
		//empresa.mostraSalarios();
		empresa.mostraEmpregados();
	}

}
