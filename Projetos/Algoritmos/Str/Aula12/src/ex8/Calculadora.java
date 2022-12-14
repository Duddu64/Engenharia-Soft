package ex8;

public class Calculadora {
	private double A, B;
	
	public void SetA_B(double A, double B) {
		this.A=A;
		this.B=B;
	}
	
	public double Soma() {
		return A+B;
	}
	public double Div() {
		return A/B;
	}
	public double Multi() {
		return A*B;
	}
	public double Sub() {
		return A-B;
	}
}
