package EX1;

public class Fornecedor extends Pessoa{
    private double valorDivida;
    private double valorCredito;
    
    public void Ent_Dados(String nome, String telefone, String endereco){
        super.setNome(nome);
        super.setEndereco(endereco);
        super.setTelefone(telefone);
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }
    
    public double ObterSaldo(){
        return valorCredito-valorDivida;
    }
}
