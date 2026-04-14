package casa.carro;

class Carro {
	String tipoC;
	
	public Carro(String tipoC) {
		this.tipoC = tipoC;
	}

	void ligar() {
		System.out.println("Carro ligado");
	}

	void desligar() {
		System.out.println("Carro desligado");
	}

	void info(String details) {
		System.out.println("Informaçõs do carro: " + details);
	}
}