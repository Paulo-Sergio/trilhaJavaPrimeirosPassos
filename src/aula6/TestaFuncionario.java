package aula6;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.setNome("Hugo");
		f1.setSalario(100);
		f1.setDepartamento("Juridico");
		f1.setRg("7544056");
		f1.recebeAumento(50);
		
		// adicionando a data como tipo
		f1.setDataEntrada(new Data(32, 7, 2009));
		//f1.getDataEntrada().preencheData(1, 7, 2009); estou passando agora direto pelo construtor
		
		f1.mostra();
	}

}
