package ex3;

public class Quadrado {
    private int lado;
    
    public int getLado(){
        return lado;
    }
    
    public void setLado(int lado){
        this.lado=lado;
    }
    
    int CalcularArea(){
        return lado*lado;
    }
}
