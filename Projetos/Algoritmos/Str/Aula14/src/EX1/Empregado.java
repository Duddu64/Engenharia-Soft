package EX1;

public class Empregado {
    private int codigoSetor;
    private double SalarioBase;
    private int Impostos;

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public int getImpostos() {
        return Impostos;
    }

    public void setImpostos(int Impostos) {
        this.Impostos = Impostos;
    }
    
    public double CalcularSalario(){
        return SalarioBase*(1-(Impostos/100));
    }
}
