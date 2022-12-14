package Ex2;

public class Cliente {
	private int codigo;
	private String nome;
	private Pedido ped=new Pedido();
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public Pedido getPed() {
		return ped;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPed(Pedido ped) {
		this.ped = ped;
	}
	
}
