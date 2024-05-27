package entidade;

import entidade.enums.Cor;

public class Circulo extends Forma {
	
	private Double raio;
	
	public Circulo() {
		super();
	}
	
	public Circulo(Cor cor,double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	
}
