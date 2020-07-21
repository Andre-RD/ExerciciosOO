package exercicio04;

public class Exercicio04 {
	public static void main(String args[]) {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "André";
		funcionario1.cidadeNascimento = "Guarulhos";
		funcionario1.idade = 21;
		funcionario1.matricula = 174920;
		funcionario1.exibirDados();
		
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Lucas";
		cliente1.cidadeNascimento = "São Paulo";
		cliente1.idade = 25;
		cliente1.cpf = "12345678999";
		cliente1.exibirDados();
		
		
		
		
	}
}
