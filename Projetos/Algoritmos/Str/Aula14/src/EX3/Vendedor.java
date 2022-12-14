package EX3;

public class Vendedor extends Empregado {
	private double ValorVendas;
	private int QuantVendas;
	
	public double getValorVendas() {
		return ValorVendas;
	}
	public int getQuantVendas() {
		return QuantVendas;
	}
	public void setValorVendas(double valorVendas) {
		ValorVendas = valorVendas;
	}
	public void setQuantVendas(int quantVendas) {
		QuantVendas = quantVendas;
	}
	
	public String PrintDados() {
		return "Dados do Vendedor: \nNome: "+getNome()+"\nSalario: "+getSalarioBase()+"\nValor das Vendas: "+ValorVendas+"\nQuantidade de Vendas: "+QuantVendas;
	}
}
