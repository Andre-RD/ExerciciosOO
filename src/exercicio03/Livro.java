package exercicio03;

public class Livro {
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	public Livro(String titulo, String autor, int numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	
	public void escreverConsole() {
		System.out.println("Livro titulo: " + this.titulo);
		System.out.println("Livro autor: " + this.autor);
		System.out.println("Livro numero de paginas: " + this.numeroPaginas);
		System.out.println("----------------------------------------");
		
	}
	
	
}
