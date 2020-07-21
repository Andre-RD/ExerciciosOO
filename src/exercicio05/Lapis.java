package exercicio05;

public class Lapis implements Escrita{
	private String ehFeitoDe;
	private String escreveCom;
	
	
	public Lapis(String ehFeitoDe,String escreveCom) {
		this.ehFeitoDe = ehFeitoDe;
		this.escreveCom = escreveCom;
	}
	
	@Override
	public void escrever() {
		System.out.println("� feito de " + this.ehFeitoDe );
		System.out.println("Escrevendo com "+ this.escreveCom);
		System.out.println("----------------------------------");
		
	}
}
