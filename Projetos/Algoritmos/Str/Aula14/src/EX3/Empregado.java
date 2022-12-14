package EX3;

public class Empregado extends Pessoa{
    private double SalarioBase;
    private String Matricula;
    
	public double getSalarioBase() {
		return SalarioBase;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setSalarioBase(double salarioBase) {
		SalarioBase = salarioBase;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

    public double valorInss() {
    	return SalarioBase*0.11;
    }
}
