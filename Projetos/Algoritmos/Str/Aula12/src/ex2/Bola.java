
package ex2;

public class Bola {
    private String cor, material;
    private double circuf;
    
    public double getCircuf(){
        return circuf;
    }
    
    public String getCor(){
        return cor;
    }
    
    public String getMaterial(){
        return material;
    }
    public void setCircuf(double Circuf){
        this.circuf=Circuf;
    }
    
    public void setCor(String cor){
        this.cor=cor;
    }
    
    public void setMaterial(String material){
        this.material=material;
    }
}
