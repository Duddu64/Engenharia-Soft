package Ex1;

public class Conta {
	private int numero;
	private double saldo;
	private double limite;
	private Agencia ag= new Agencia();
	
	
	public Agencia getAg() {
		return ag;
	}
	public void setAg(Agencia ag) {
		this.ag = ag;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
