package Ex2;

public class Pedido {
	private int numero;
	private double valor;
	private Cliente cli=new Cliente();
	
	public Cliente getCli() {
		return cli;
	}
	public void setCli(Cliente cli) {
		this.cli = cli;
	}
	public int getNumero() {
		return numero;
	}
	public double getValor() {
		return valor;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
