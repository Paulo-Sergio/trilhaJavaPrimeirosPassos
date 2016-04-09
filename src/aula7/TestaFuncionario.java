package aula7;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.setNome("Hugo");
		f1.setSalario(100);
		f1.setDepartamento("Juridico");
		f1.setRg("7544056");
		f1.recebeAumento(50);
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Sergio");
		f2.setSalario(500);
		f2.setDepartamento("Analista");
		f2.setRg("7588022");
		f2.recebeAumento(150);
		
		// adicionando a data como tipo
		f1.setDataEntrada(new Data(32, 7, 2009));
		f2.setDataEntrada(new Data(15, 11, 2014));
		//f1.getDataEntrada().preencheData(1, 7, 2009); estou passando agora direto pelo construtor
		
		f1.mostra();
		f2.mostra();
	}

}
