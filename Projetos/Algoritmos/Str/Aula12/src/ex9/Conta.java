package ex9;

public class Conta {
	private int Numero;
	private String Tipo, Nome;
	private double Saldo;
	
	public Conta() {
		this.Saldo=0;
	}
	public Conta(String Nome, int Numero) {
		this.Nome=Nome;
		this.Numero=Numero;
		this.Saldo=0;
	}
	public void Depositar(double valor) {
		this.Saldo+=valor;
	}
	public void Sacar(double valor) {
		this.Saldo-=valor;
	}
	public int getNumero() {
		return Numero;
	}
	public String getTipo() {
		return Tipo;
	}
	public String getNome() {
		return Nome;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
}
