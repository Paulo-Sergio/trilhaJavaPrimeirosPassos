package aula5;

public class Funcionario {

	private String nome; 
	private String departamento;
	private String rg;
	private double salario;
	private Data dataEntrada; 
	
	void recebeAumento(double valorAumento){
		this.salario = salario + valorAumento;
	}
	
	public double getGanhoAnual(){
		return this.salario * 12;
	}
	
	public void mostra(){
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
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	 public String getDepartamento() {
         return this.departamento;
     }

     public void setDepartamento (String departamento) {
         this.departamento = departamento;
     }
     
     public Data getDataEntrada() {
         return this.dataEntrada;
     }

     public void setDataEntrada (Data dataEntrada) {
         this.dataEntrada = dataEntrada;
     }
     
     public String getRg() {
         return this.rg;
     }
     
     public void setRg (String rg){
    	 this.rg = rg;
     }
}
