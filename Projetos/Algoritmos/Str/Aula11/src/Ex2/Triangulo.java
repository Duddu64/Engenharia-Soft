package Ex2;

public class Triangulo {
    double base;
    double altura;
    
    public Triangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    
    double Area(){
        return (base*altura)/2;
    }
}
