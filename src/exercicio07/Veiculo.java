package exercicio07;

public class Veiculo {
	protected String nome;
	protected int numeroDeRodas;
	protected double capacidadeTanqueCombustivel;
	protected double volumeTanqueCombustivel; //L
	protected double consumo; //km/L
	
	public double abastecer() {
		return this.volumeTanqueCombustivel = this.capacidadeTanqueCombustivel;
	}
	public void autonomia() {
		double distanciaCapacidade = this.consumo* this.capacidadeTanqueCombustivel;
		double distanciaVolumeTanque = this.consumo* this.volumeTanqueCombustivel;
		
		System.out.println("Autonomia Tanque cheio: " + distanciaCapacidade + "Km");
		System.out.println("Autonomia Tanque atual: " + distanciaVolumeTanque + "Km"); 
		
		
	}
}
