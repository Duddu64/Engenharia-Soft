
package ex1;

public class Pessoa {
    private String nome;
    private int Idade;
    
    public int getIdade(){
        return Idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int Idade){
        this.Idade=Idade;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
}
