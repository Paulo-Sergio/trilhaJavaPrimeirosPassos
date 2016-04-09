package aula4;

public class Funcionario {

	String nome; 
	String departamento;
	String rg;
	double salario;
	Data dataEntrada; 
	
	void recebeAumento(double valorAumento){
		this.salario = salario + valorAumento;
	}
	
	double calculaGanhoAnual(){
		return this.salario * 12;
	}
	
	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		//System.out.println("Data de entrada: " + this.dataEntrada.getMostraData());
		//System.out.println("Dia: " + this.dataEntrada.dia);
		//System.out.println("Mes: " + this.dataEntrada.mes);
		//System.out.println("Ano: " + this.dataEntrada.ano);
		System.out.println("RG: " + this.rg);
		System.out.println("Salario: " + this.salario);
		System.out.println("");
	}

}
