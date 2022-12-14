package Ex2;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Contato cot = new Contato();
        Endereco end = new Endereco();
        Telefone tele = new Telefone();
        
        
        try{
            tele.setTipo(JOptionPane.showInputDialog("Tipo do telefone: "));
            tele.setDDD(JOptionPane.showInputDialog("DDD: "));
            tele.setNumero(JOptionPane.showInputDialog("Número: "));
            
            end.setUF(JOptionPane.showInputDialog("UF: "));
            end.setCEP(JOptionPane.showInputDialog("CEP: "));
            end.setCidade(JOptionPane.showInputDialog("Cidade: "));
            end.setRua(JOptionPane.showInputDialog("Rua: "));
            end.setNumero(JOptionPane.showInputDialog("Número: "));
            
            cot.setNome(JOptionPane.showInputDialog("Digite o nome do contato: "));
            cot.setEndereco(end);
            cot.setTelefone(tele);
            JOptionPane.showMessageDialog(null, "Contato: "+cot.getNome()+"\nTelfone:\nTipo do telefone: "+cot.getTelefone().getTipo()+"\n("+cot.getTelefone().getDDD()+") "
                                        +cot.getTelefone().getNumero()+"\nEndereço:\nCEP: "+cot.getEndereco().getCEP()+"\nUF: "+cot.getEndereco().getUF()+"\nCidade: "+cot.getEndereco().getCidade()
                                        +"\nRua: "+cot.getEndereco().getRua()+"\nNúmero: "+cot.getTelefone().getNumero());
        }
        catch(Exception e){
            System.out.println("Vc digitou algo errado!!");
        }
        
    }
}
