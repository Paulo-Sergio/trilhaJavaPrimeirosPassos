package aula4;

public class Data {

	int dia;
    int mes;
    int ano;
    
    void preencheData(int dia, int mes, int ano){
    	this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

	public String getMostraData() {
		return dia+"/"+mes+"/"+ano;
	}
}
