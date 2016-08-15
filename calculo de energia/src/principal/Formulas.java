package principal;

public class Formulas {

	double potencia = 5; //KW 1KW = 1000W
	double horas_ligado = 1;
	double dias_ligado = 30; 
	double valor_kwh = 0.52; //Custo da luz com a operadora
	
	public double KWmes(){		
		double kwmes = potencia * dias_ligado * horas_ligado;
		return kwmes;
	}
	
	public double ValorMensal(){
		double valor_mensal = KWmes() * valor_kwh;
		return valor_mensal;
	}
	
	public void Display(){
		System.out.println("KW/Hora mensal " + KWmes() + "KWh\n"
				+ "Valor Mensal R$" + ValorMensal());
	}
}