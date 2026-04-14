package casa.conta;

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