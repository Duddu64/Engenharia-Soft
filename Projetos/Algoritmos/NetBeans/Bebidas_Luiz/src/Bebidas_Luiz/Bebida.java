package Bebidas_Luiz;

public class Bebida {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
    public void efetuarVenda(int qtd){
        this.qtdEstoque=this.qtdEstoque-qtd;
    }
}
