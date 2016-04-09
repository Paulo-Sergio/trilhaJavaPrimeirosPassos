package aula7;

public class Empresa {

	private String cnpj;
	private Funcionario[] empregados;
	private int livre = 0;
	
	public Empresa(String cnpj) {
		this.cnpj = cnpj;
		this.empregados = new Funcionario[10];
	}
	
	void adiciona(Funcionario f){
		this.empregados[livre] = f;
		livre++;
	}
	
	void mostraSalarios(){
		for (int i = 0; i < this.livre; i++) {
			System.out.println(this.empregados[i].getSalario());
		}
	}
	
	void mostraEmpregados(){
		for (int i = 0; i < empregados.length; i++) {
			Funcionario empregado = empregados[i];
			if(empregado != null){
				empregado.mostra();
			}
		}
	}
	
	boolean contem(Funcionario f){
		for (int i = 0; i < empregados.length; i++) {
			if(f == empregados[i]){
				return true;
			}
		}
		return false;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario[] getEmpregados() {
		return empregados;
	}

	public void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}
}
