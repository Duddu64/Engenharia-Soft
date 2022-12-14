package Ex1;

public class Gerente {
    double Salario;
    
    public Gerente (double Salario){
        this.Salario=Salario;
    }
    
    void AumentoSalarial(){
        this.Salario=this.Salario*1.1;
    }
    void AumentoSalarial(double taxa){
        taxa=taxa/100;
        this.Salario=this.Salario*(taxa+1);
    }
}
