package classe;

public class valorVsReferencia {

	public static void main(String[] args) {
		
	double a = 2;
	double b = a; //atribuição por valor (tipo primitivo)
	
	a++;
	b--;
	
	System.out.println(a + " " + b);
	
	Data d1 = new Data(1, 6, 2022);
	Data d2 = d1; //atribuição por referencia (Objetivo)
	
	d1.dia = 31;
	d2.mes = 12;
	
	System.out.println(d1.dataFormatada());
	System.out.println(d2.dataFormatada());
	
	voltarDataParaValorPadrao(d1);
	
	System.out.println(d1.dataFormatada());
	System.out.println(d2.dataFormatada());
}
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	}
	
