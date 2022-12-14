package Ex2;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Empresa {
    private String CNPJ;
    private String razaoSocial;
    ArrayList <Funcionario> pea=null;
    
    
    public Empresa(){
        pea=new ArrayList <Funcionario>();
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public void ADD(Funcionario v){
        pea.add(v);
    }
    
    public void Buscar_func(String nome){
        for(int v=0; v<pea.size(); v++){
            if(nome.equals(pea.get(v).getNome())){
                JOptionPane.showMessageDialog(null, "Nome: "+pea.get(v).getNome()+"\nCódigo do Funcionário: "+pea.get(v).getCodigo()+"\nSálario: "+pea.get(v).getSalario());
            }
        }
    }
    
    public void Imprime_Func(){
        for(int v=0; v<pea.size(); v++){
            JOptionPane.showMessageDialog(null, "Nome: "+pea.get(v).getNome()+"\nCódigo do Funcionário: "+pea.get(v).getCodigo()+"\nSálario: "+pea.get(v).getSalario());
        }
    }
    
    public void Folha(){
        double total=0;
        for(int v=0; v<pea.size(); v++){
            total+=pea.get(v).getSalario();
        }
        JOptionPane.showMessageDialog(null, "Folha de Pagamento: "+total);
    }
    
    
}
