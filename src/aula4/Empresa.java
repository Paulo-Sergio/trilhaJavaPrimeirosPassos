package aula4;

public class Empresa {

	String nome;
	String cnpj;
	Funcionario[] empregados;
	int livre = 0;
	
	void adiciona(Funcionario f){
		this.empregados[livre] = f;
		livre++;
	}
	
	void mostraSalarios(){
		for (int i = 0; i < this.livre; i++) {
			System.out.println(this.empregados[i].salario);
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
}
