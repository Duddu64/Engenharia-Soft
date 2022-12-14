package ex7;

public class Livro {
    private double preco;
    private int ano, codigo;
    private String editora, titulo;
    
    public Livro(){
    	
    }
    
    public Livro(double preco, int ano, int codigo, String editora, String titulo) {
    	this.ano=ano;
    	this.codigo=codigo;
    	this.preco=preco;
    	this.editora=editora;
    	this.titulo=titulo;
    	
    }
    
	public double getPreco() {
		return preco;
	}
	public int getAno() {
		return ano;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getEditora() {
		return editora;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
    
	
    
}
