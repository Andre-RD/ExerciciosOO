package exercicio02;

public class Triangulo {
	public double base;
	public double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double area() {	
		return base*altura/2;
	}
	
	public void imprimirConsole() {
		System.out.println("O valor da area do triangulo "+base+" por "+altura+" é: " + area());
		System.out.println("---------------------------------------------");
	}
}
