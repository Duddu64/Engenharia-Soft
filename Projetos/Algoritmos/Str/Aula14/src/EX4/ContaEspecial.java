package EX4;

public class ContaEspecial extends ContaBancaria{
	private float limite;

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public void sacar(double valor){
		double saldo = getSaldo()+limite;
		if(valor>saldo){
			System.out.println("Operação Negada!!");	
		}
		else{
			setSaldo(getSaldo()-valor);
		}
	}
}
