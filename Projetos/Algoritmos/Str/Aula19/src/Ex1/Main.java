package Ex1;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Agencia ob1=new Agencia();
		Conta ob2=new Conta();
		try {
			ob1.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da agência: ")));
			ob2.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta: ")));
			ob2.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: ")));
			ob2.setLimite(Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta: ")));
			ob2.setAg(ob1);
			JOptionPane.showMessageDialog(null, "Numero da Agencia: "+ ob2.getAg().getNumero()+"\nNumero da Conta: "+ob2.getNumero()+"\nSaldo da Conta: "+ob2.getSaldo()+"\nLimite da Conta: "+ob2.getLimite());
		}
		catch(Exception e) {
			System.out.println("Os entrada de dados inválida!!");
		}
	}
}
