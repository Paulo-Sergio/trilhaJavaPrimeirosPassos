package aula4;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.nome = "Hugo";
		f1.salario = 100;
		f1.recebeAumento(50);
		
		
		// adicionando a data como tipo
		f1.dataEntrada = new Data();
		f1.dataEntrada.preencheData(1, 7, 2009);
		
		f1.mostra();
	}

}
