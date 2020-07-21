package exercicio04;

public class Funcionario extends Pessoa {
	protected int matricula;
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Matricula Funcionario: "+this.matricula);
		System.out.println("----------------------------------------");
	}
	
}
