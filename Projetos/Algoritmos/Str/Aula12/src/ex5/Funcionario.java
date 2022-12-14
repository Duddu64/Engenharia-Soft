package ex5;

public class Funcionario {
    private double salario;
    private int Idade, AnosSer;
    
    public double getSalario(){
        return salario;
    }
    
    public int getIdade(){
        return Idade;
    }
    
    public int getAnosSer(){
        return AnosSer;
    }
    public void setSalario(double Salario){
        salario=Salario;
    }
    
    public void setIdade(int Idade){
        this.Idade=Idade;
    }
    
    public void setAnosSer(int AnosSer){
        this.AnosSer=AnosSer;
    }
    
    public void Imprime(){
        System.out.println("Salario: "+salario+"\nIdade: "+Idade+"\nAnos de Serviço: "+AnosSer+"\n"+Aposentadoria());
    }
    
    public String Aposentadoria(){
        if(Idade>60 && AnosSer>=35){
            return "Pode se Aposentar";
        }else{
            return "Não pode se Aposentar";
        }
    }
}
