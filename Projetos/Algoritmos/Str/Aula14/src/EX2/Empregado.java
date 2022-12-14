
package EX2;

public class Empregado {
    private String Nome;
    protected double salarioFixo;
    
    
    public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Empregado(String Nome, double salarioFixo){
        this.Nome=Nome;
        this.salarioFixo=salarioFixo;
    }
    
    public String imprimeDados(){
        return "Nome: "+Nome+"\nSálario: "+salarioFixo;
    }
    
    public double CalculaSalario(){
        return salarioFixo;
    } 
}
