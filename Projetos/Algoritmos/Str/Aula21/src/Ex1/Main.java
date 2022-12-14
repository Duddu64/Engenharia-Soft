package Ex1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Revista n = new Revista();
        Artigo me = null;
        int bol = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de artigos da revista:"));
        
        try{
            n.setNome(JOptionPane.showInputDialog("Digite o nome da revista:"));
            n.setEdicao(Integer.parseInt(JOptionPane.showInputDialog("Digite a edição da revista: ")));
            for(int c=0; c<bol; c++){
                me = new Artigo();
                me.setPaginas(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de páginas do artigo["+c+"]: ")));
                me.setTitulo(JOptionPane.showInputDialog("Digite o titulo do artigo["+c+"]: "));
                n.ADD(me);
                
            }
            n.Imprime_revis();
        }
        catch(Exception e){
            System.out.println("Vc digitou algo errado!!");
        }
        
    }
}
