package Ex2;
import java.util.ArrayList;

public class Agencia {
    private int codigo;
    ArrayList <Conta> conts = new ArrayList <Conta>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void imprime_contas() {
        
    }

    public void setCont(Conta cont) {
        conts.add(cont);
    }
    
}
