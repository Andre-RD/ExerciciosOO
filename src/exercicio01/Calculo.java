package exercicio01;

public class Calculo {
	public double a;
	public double b;
	public double c;
	double delta;
	double x1;
	double x2;
	
	public void calculaBhaskara() {
		delta = Math.pow(b,2)+(-4*a*c);	
		if(a==0) {
			x1=-c/b;
			x2=x1;
		}	
		else if(delta < 0) {
			System.out.println("Solução não pertence ao conjunto dos Reais!!!");
		}else{
			x1 = (-b+ Math.sqrt(delta))/2*a;
			x2 = (-b- Math.sqrt(delta))/2*a;
		}
	}
	
	public void imprimirTela() {
		System.out.println("Valor de delta="+ delta);
		System.out.println("Valor de x1=" +x1);
		System.out.println("Valor de x2=" +x2);
		
	}



}
