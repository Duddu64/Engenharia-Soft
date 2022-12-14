package EX3;

public class Cliente extends Pessoa{
	private int anonasc;
	private double ValorDivida;
	
	
	public int getAnonasc() {
		return anonasc;
	}


	public double getValorDivida() {
		return ValorDivida;
	}


	public void setAnonasc(int anonasc) {
		this.anonasc = anonasc;
	}


	public void setValorDivida(double valorDivida) {
		ValorDivida = valorDivida;
	}


	public String PrintDados() {
		return "Dados do Cliente: \nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSexo: "+getSexo()+"\nValor da dívida: "+ValorDivida+"\nAno de Nascimento: "+anonasc;
	}
}
