class Conta {
	String titular;
	double saldo;
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	void depositar(double valor) {
		saldo += valor;
		System.out.println("Novo valor após depósito: " + saldo);
	}

	void sacar(double valor) {
		saldo -= valor;
		System.out.println("Novo valor após saque: " + saldo);
	}

	void mostrarSaldo() {
		System.out.println("Saldo: " + saldo);
	}
}

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

class Lampada {
	void acender() {
		System.out.println("Lâmpada acesa");
	}

	 void apagar() {
		System.out.println("Lâmpada apagada");
	}

	void info(String details) {
		System.out.println("Detalhes da lâmpada: " + details);
	}
}

class CasaSimulada {
	public static void main(String[] args) {
		Conta p1 = new Conta("Sara", 4000);
		p1.mostrarSaldo();
		p1.depositar(2000);
		p1.sacar(500);
		

		Carro c1 = new Carro("SUV");
		System.out.println("Tipo de carro: " + c1.tipoC);
		c1.ligar();
		c1.desligar();
		c1.info("Chevrolet");

		Lampada l1 = new Lampada();
		l1.acender();
		l1.apagar();
		l1.info("110V");
	}
}
