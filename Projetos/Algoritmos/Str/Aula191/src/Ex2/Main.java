package Ex2;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Pedido ob1=new Pedido();
		Cliente ob2=new Cliente();
		try {
			ob2.setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));
			ob2.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do cliente: ")));
			ob1.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do pedido: ")));
			ob1.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pedido: ")));
			ob2.setPed(ob1);
			JOptionPane.showMessageDialog(null, "Cliente: "+ ob2.getNome()+"\nCodigo do Cliente: "+ob2.getCodigo()+"\nNúmero do pedido: "+ob2.getPed().getNumero()+"\nValor do pedido: "+ob2.getPed().getValor());
		}
		catch(Exception e) {
			System.out.println("Os entrada de dados inválida!!");
		}
	}
}
