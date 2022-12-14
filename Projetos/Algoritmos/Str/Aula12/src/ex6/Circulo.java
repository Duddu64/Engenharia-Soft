package ex6;

public class Circulo {
    private double raio, area, perimetro;
    double pi=3.141516;
    
    public void setRaio(double raio){
        this.raio=raio;
    }
    
    
    public void CalcularPerim(){
        perimetro=(2*pi*raio);
    }
    
    public void CalcularArea(){
        area=(raio*raio)*pi;
    }
    
    public void Imprime(){
    	CalcularPerim();
    	CalcularArea();
        System.out.println("Raio do Circulo: "+raio+"\nPerimetro do Circulo: "+perimetro+"\nArea do Circulo: "+area);
    }
            
}
