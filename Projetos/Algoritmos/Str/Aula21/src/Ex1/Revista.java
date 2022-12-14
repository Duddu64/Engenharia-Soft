package Ex1;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Revista {
    private int edicao;
    private String nome;
    ArrayList <Artigo> revis;
    
    public Revista(){
        revis = new ArrayList <Artigo>();
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void ADD(Artigo b){
        revis.add(b);
    }
    
    public void Imprime_revis(){
        String msg="Revista "+nome+" edição "+edicao;
        for(Artigo v: revis){
            msg+="\nArtigo: "+v.getTitulo()+"\número de´páginas: "+v.getPaginas();
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
