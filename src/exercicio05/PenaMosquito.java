package exercicio05;

public class PenaMosquito implements Escrita{
	private String ehFeitoDe;
	private String escreveCom;
	
	
	public PenaMosquito(String ehFeitoDe,String escreveCom) {
		this.ehFeitoDe = ehFeitoDe;
		this.escreveCom = escreveCom;
	}
	
	@Override
	public void escrever() {
		System.out.println("É feito de " + this.ehFeitoDe );
		System.out.println("Escrevendo com "+ this.escreveCom);
		System.out.println("----------------------------------");
		
	}
}
