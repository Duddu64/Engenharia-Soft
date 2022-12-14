package Ex3;
import java.util.ArrayList;

public class Venda {
	private int numero;
	private String data;
	private Comprador ob1=new Comprador();
	private Vendedor ob2=new Vendedor();
	ArrayList <Produto> list = null;
	
	public Venda() {
		list=new ArrayList <Produto>();
	}

	public int getNumero() {
		return numero;
	}

	public String getData() {
		return data;
	}

	public Comprador getOb1() {
		return ob1;
	}

	public Vendedor getOb2() {
		return ob2;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setOb1(Comprador ob1) {
		this.ob1 = ob1;
	}

	public void setOb2(Vendedor ob2) {
		this.ob2 = ob2;
	}

	public void ADD(Produto L) {
		list.add(L);
	}
	
	public String Produtos() {
		String msg="";
		
		for(int x=0; x<list.size(); x++) {
			msg+="\n\nProduto ["+x+"]: \nNome: "+list.get(x).getNome()+"\nPreço: "+list.get(x).getPreco()+"\nQuantidade: "+list.get(x).getQtde();
		}
		
		return msg;
	}
}
