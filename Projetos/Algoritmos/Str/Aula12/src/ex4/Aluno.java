package ex4;

public class Aluno {
    private String matricula;
    private double nota1, nota2;
    
    public double getnota1(){
        return nota1;
    }
    
    public double getnota2(){
        return nota2;
    }
    
    public String getMatricula(){
        return matricula;
    }
    public void setNota1(double nota1){
        this.nota1=nota1;
    }
    
    public void setNota2(double nota2){
        this.nota2=nota2;
    }
    
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    
    double CalculaMedia(){
        return(nota1+nota2)/2;
    }
    
    String ImprimeDados(){
        return "Matricula: "+matricula+" Nota 1: "+nota1+" Nota2: "+nota2+" Média: "+CalculaMedia();
    }
}
