package exercicio04;

public class Pessoa {
	protected  String nome;
	protected  int idade;
	protected  String cidadeNascimento;
	
	public void exibirDados() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Idade: "+ this.idade);
		System.out.println("Cidade: "+ this.cidadeNascimento);
	}
	
}
