package EX4;

public class ContaPoupança extends ContaBancaria{
	private int diaDeRendimento;
	
	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}

	//irei usar uma taxa fixa de 2% ao dia
	public void calcularNovoSaldo() {
		int cont=0;
		do{
			setSaldo(getSaldo()*1.02);
			cont++;
		}while(cont!=diaDeRendimento);
	}
}
