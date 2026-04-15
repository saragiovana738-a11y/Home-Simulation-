package casa.carro;

class Carro {
	private String tipoC;
	
	public Carro(String tipoC) {
		this.tipoC = tipoC;
	}
	public String getTipoC() {
		return tipoC;
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
