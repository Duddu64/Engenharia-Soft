package EX2;

public class Gerente extends Empregado{
    private double gratificação;
    
    public Gerente (String Nome, double salario, double gratificação) {
    	setNome(Nome);
    	this.salarioFixo=salario;
    	this.gratificação=gratificação;
    }
    
    public String imprimeDados(){
        return "Nome: "+getNome()+"\nSálario: "+CalculaSalario();
    }
    
    public double CalculaSalario() {
    	return this.salarioFixo+gratificação;
    }
}
