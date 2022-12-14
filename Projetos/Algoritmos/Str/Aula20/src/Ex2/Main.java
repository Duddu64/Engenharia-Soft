package Ex2;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Empresa n = new Empresa();
        Funcionario me = null;
        
        try{
            n.setRazaoSocial(JOptionPane.showInputDialog("Digite a raazão social da empresa: "));
            n.setCNPJ(JOptionPane.showInputDialog("Digite o CNPJ da empresa: "));
            int op;
            do{
                op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n1.Cadastrar Funcionário. \n2. Imprimir todos os funcionários. \n3.Apresentar o total da folha de pagamento. \n4.Consultar dados de um funcionário. \n5.Sair."));
                if(op==1){
                    me= new Funcionario();
                    me.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário: "));
                    me.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do funcionário: ")));
                    me.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o sálario: ")));
                    n.ADD(me);
                }else{
                    if(op==2){
                        n.Imprime_Func();
                    }else{
                        if(op==3){
                            n.Folha();
                        }else{
                            if(op==4){
                                String funci=JOptionPane.showInputDialog("Digite o nome do funcionário");
                                n.Buscar_func(funci);
                            }
                        }
                    }
                }
            }while(op!=5);
        }
        catch(Exception e){
            System.out.println("Vc digitou algo errado!!");
        }
        
    }
}
