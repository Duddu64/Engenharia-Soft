package Ex3;

import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args){
        Vendedor n = new Vendedor();
        Comprador p = new Comprador();
        Venda j = new Venda();
        Produto me = null;
        double tot=0;
        try{
        	j.setData(JOptionPane.showInputDialog("Digite a data da venda: "));
            j.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da venda: ")));
        	
            int op;
            do{
                op = Integer.parseInt(JOptionPane.showInputDialog("Gostaria de adicionar mais um produto: 1.Sim 2.Não"));
                if(op==1){
                    me= new Produto();
                    me.setNome(JOptionPane.showInputDialog("Digite o nome do produto: "));
                    me.setQtde(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: ")));
                    me.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço: ")));
                    j.ADD(me);
                    tot+=(me.getPreco()*me.getQtde());
                }
            }while(op!=2);
            
            p.setNome(JOptionPane.showInputDialog("Digite o nome do comprador: "));
            p.setPagto(JOptionPane.showInputDialog("Digite o pagamento do comprador: "));
            j.setOb1(p);
        	n.setNome(JOptionPane.showInputDialog("Digite o nome do vendedor: "));
            n.setComissao(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da comissão do vendedor: ")));
            j.setOb2(n);
            JOptionPane.showMessageDialog(null, "*****Venda*****"+j.Produtos()+"\n\n|||||||||||Total: "+tot+"||||||||||\nData da venda: "+j.getData()+"\nNúmero da venda: "+j.getNumero()+"\n\n*****Vendedor*****\nNome: "+j.getOb2().getNome()+"\nComissão: "+j.getOb2().getComissao()+"\n\n*****Comprador*****\nNome: "+j.getOb1().getNome()+"\nPagamento: "+j.getOb1().getPagto());
        }
        catch(Exception e){
            System.out.println("Os dados não conferem!!");
        }
        
    }
}
