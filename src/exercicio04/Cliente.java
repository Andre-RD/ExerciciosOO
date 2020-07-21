package exercicio04;

public class Cliente extends Pessoa {
	protected String cpf;
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Cpf Cliente: "+this.cpf);
		System.out.println("----------------------------------------");
	}
}
