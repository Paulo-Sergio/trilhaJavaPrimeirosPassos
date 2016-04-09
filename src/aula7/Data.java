package aula7;

public class Data {

	int dia;
    int mes;
    int ano;
    
    public Data(int dia, int mes, int ano) {
    	this.dia = dia;
    	this.mes = mes;
    	this.ano = ano;
    	
    	if(!isDataViavel(dia, mes, ano)){
    		System.out.println("A data " + getMostraData() + " não existe!");
    	}
	}
    
    public boolean isDataViavel(int dia, int mes, int ano){
    	if(dia <= 0 && mes <= 0){
    		return false;
    	}
    	
    	int ultimoDiaMes = 31; //por padrão são 31 dias
    	if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
    		ultimoDiaMes = 30;
    	}else if(mes == 2){
    		if(ano % 4 == 0){
    			ultimoDiaMes = 29;
    		}else{
    			ultimoDiaMes = 28;
    		}
    	}
    	
    	if(dia > ultimoDiaMes){
    		return false;
    	}
    	
    	return true;
    }
    
    void preencheData(int dia, int mes, int ano){
    	this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

	public String getMostraData() {
		return dia+"/"+mes+"/"+ano;
	}
}
