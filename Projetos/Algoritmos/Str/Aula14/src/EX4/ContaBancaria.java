package EX4;

public class ContaBancaria {
	private String cliente;
	private int num_conta;
	private double saldo;
	
	
	public String getCliente() {
		return cliente;
	}

	public int getNum_conta() {
		return num_conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		if(valor>saldo) {
			System.out.println("Operação negada!!");
		}else {
			saldo-=valor;
		}
	}
	
	public void depositar(double valor) {
		saldo+=valor;
	}
}
