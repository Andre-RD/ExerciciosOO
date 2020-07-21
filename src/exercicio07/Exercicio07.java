package exercicio07;

public class Exercicio07 {
	public static void main(String args[]) {
		Veiculo carro = new Veiculo();
		carro.nome = "Uno de firma";
		carro.numeroDeRodas = 4;
		carro.capacidadeTanqueCombustivel = 54;
		carro.volumeTanqueCombustivel = 25;
		carro.consumo = 32;
		//carro.abastecer();
		carro.autonomia();
		
		Veiculo moto = new Veiculo();
		moto.nome = "Bizinha";
		moto.numeroDeRodas = 2;
		moto.capacidadeTanqueCombustivel = 17;
		moto.volumeTanqueCombustivel = 10;
		moto.consumo = 35;
		//moto.abastecer();
		moto.autonomia();
		
		
		
		
	}
	
}
